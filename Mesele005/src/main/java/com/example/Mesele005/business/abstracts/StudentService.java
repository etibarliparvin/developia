package com.example.Mesele005.business.abstracts;

import com.example.Mesele005.entity.concretes.Student;

import java.util.List;

public interface StudentService {

    boolean add(Student student);

    List<Student> getAll();
}
