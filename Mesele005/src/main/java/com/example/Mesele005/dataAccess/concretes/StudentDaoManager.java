package com.example.Mesele005.dataAccess.concretes;

import com.example.Mesele005.core.abstracts.MyConnectionService;
import com.example.Mesele005.dataAccess.abstracts.StudentDao;
import com.example.Mesele005.entity.concretes.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDaoManager implements StudentDao {

    private MyConnectionService myConnectionService;

    public StudentDaoManager(MyConnectionService myConnectionService) {
        this.myConnectionService = myConnectionService;
    }

    @Override
    public boolean add(Student student) {
        try (Connection c = myConnectionService.connect()) {
            String query = "insert into student(name, surname, birthdate) values(?, ?, ?)";
            PreparedStatement ps = c.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setString(2, student.getSurname());
            ps.setDate(3, new java.sql.Date(student.getBirthdate().getTime()));
            return ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Student> getAll() {
        List<Student> students = new ArrayList<>();
        try (Connection c = myConnectionService.connect()) {
            String query = "select * from student";
            PreparedStatement ps = c.prepareStatement(query);
            ps.execute();
            ResultSet rs = ps.getResultSet();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String surname = rs.getString("surname");
                Date birthdate = rs.getDate("birthdate");
//                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//                Date birthdate = sdf.parse(birthdateStr);
                students.add(new Student(name, surname, birthdate));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
