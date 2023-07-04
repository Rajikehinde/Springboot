package com.raji.Springdemo.student;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final InMemoryStudentDao dao;

    public StudentService(InMemoryStudentDao dao) {
        this.dao = dao;
    }

    Student save(Student s){
        return this.dao.save(s);
    }
    public List<Student> findAllStudent(){
        return dao.findAllStudent();
    }
    Student findByIEmail(String email){
        return dao.findByIEmail(email);
    }
    Student update(Student s){
        return dao.update(s);
    }
    void delete(String email){
        dao.delete(email);
    }
}
