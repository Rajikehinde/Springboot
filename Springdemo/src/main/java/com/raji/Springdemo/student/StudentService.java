package com.raji.Springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {
    public List<Student> findAllStudent(){
        return List.of(
                new Student(
                        "Kehinde",
                        "Raji",
                        LocalDate.now(),
                        "kehinderaji28@gmail.com",
                        28
                ),
                new Student(
                        "Taiwo",
                        "Raji",
                        LocalDate.now(),
                        "taiworaji29 @gmail.com",
                        28
                )
        );
    }
}
