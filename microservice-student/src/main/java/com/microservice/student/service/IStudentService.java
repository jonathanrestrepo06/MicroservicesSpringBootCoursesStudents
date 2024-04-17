package com.microservice.student.service;

import com.microservice.student.entities.Student;

import java.util.List;

public interface IStudentService {

    List<Student> findAll();
    Student findById(long id);
    void save(Student student);
    void deleteById(long id);

    List<Student> findAllByCourseId(Long idCourse);
}
