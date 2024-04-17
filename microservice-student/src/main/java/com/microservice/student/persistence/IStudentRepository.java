package com.microservice.student.persistence;

import com.microservice.student.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IStudentRepository extends CrudRepository<Student, Long> {

    @Query("SELECT s FROM" + " Student s WHERE s.courseId = :idCourse")
    List<Student> findAllByCourseId(Long idCourse); // SELECT * FROM student WHERE course_id = :courseId;

   /* @Querry("SELECT * FROM" + " student )")
    List<Student> findAllStudent(Long courseId); // SELECT * FROM student WHERE course_id = :courseId;
    */

}
