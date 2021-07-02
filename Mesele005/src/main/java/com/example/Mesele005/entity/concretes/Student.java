package com.example.Mesele005.entity.concretes;

import com.example.Mesele005.entity.abstracts.Entity;

import java.util.Date;

public class Student implements Entity {

    private String name;
    private String surname;
    private Date birthdate;

    public Student() {
    }

    public Student(String name, String surname, Date birthdate) {
        this.name = name;
        this.surname = surname;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }
}
