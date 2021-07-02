package com.example.Mesele005.servlets;

import com.example.Mesele005.business.abstracts.StudentService;
import com.example.Mesele005.business.concretes.StudentManager;
import com.example.Mesele005.core.concretes.MyConnectionServiceAdapter;
import com.example.Mesele005.dataAccess.concretes.StudentDaoManager;
import com.example.Mesele005.entity.concretes.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "StudentRegisterServlet", value = "/student-register")
public class StudentRegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("register.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentManager(new StudentDaoManager(new MyConnectionServiceAdapter()));
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String birthdateStr = req.getParameter("birthdate");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdate = null;
        try {
            birthdate = sdf.parse(birthdateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        studentService.add(new Student(name, surname, birthdate));

        resp.sendRedirect("students");
    }
}
