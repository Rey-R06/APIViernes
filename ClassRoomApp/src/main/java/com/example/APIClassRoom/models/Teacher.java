package com.example.APIClassRoom.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_teacher")
    private Integer id;
    private  String speciality;

    @OneToMany(mappedBy = "teacher")
    @JsonManagedReference
    private List<Course> courses;

    public Teacher() {
    }

    public Teacher(Integer id, String speciality) {
        this.id = id;
        this.speciality = speciality;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
