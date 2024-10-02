package com.example.src.main.java.reposetory;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import com.example.src.main.java.model.Student;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepoImpl  {
    @PersistenceContext
    private EntityManager entityManager;
    @Transactional
    public void saveStudent(Student student){
        entityManager.persist(student);
    }
    @Transactional
    public List<Student> getAllStudents(){
        return entityManager.createQuery("select s from Student  s",Student.class).getResultList();
    }
}
