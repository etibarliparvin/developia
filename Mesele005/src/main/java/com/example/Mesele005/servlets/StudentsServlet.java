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
import java.util.List;

@WebServlet(name = "StudentsServlet", value = "/students")
public class StudentsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StudentService studentService = new StudentManager(new StudentDaoManager(new MyConnectionServiceAdapter()));
        List<Student> students = studentService.getAll();

        req.setAttribute("students", students);
        req.getRequestDispatcher("students.jsp").forward(req, resp);
    }
}
