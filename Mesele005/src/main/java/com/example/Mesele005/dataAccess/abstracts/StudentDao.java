package com.example.Mesele005.dataAccess.abstracts;

import com.example.Mesele005.entity.concretes.Student;

import java.util.List;

public interface StudentDao {

    boolean add(Student student);

    List<Student> getAll();

}
