package com.example.Mesele005.business.concretes;

import com.example.Mesele005.business.abstracts.StudentService;
import com.example.Mesele005.dataAccess.abstracts.StudentDao;
import com.example.Mesele005.entity.concretes.Student;

import java.util.List;

public class StudentManager implements StudentService {

    private StudentDao studentDao;

    public StudentManager(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public boolean add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }
}
