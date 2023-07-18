package com.example.librarymanagementsystemmaven.service;

import com.example.librarymanagementsystemmaven.dao.StudentDAO;
import com.example.librarymanagementsystemmaven.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDAO studentDAO;

    //add specific student to the library system
    public Student addAStudent(Student student){
        return studentDAO.save(student);
    }
    //return a list of all the students in the library
    public List<Student> returnStudetnList(){
        return studentDAO.findAll();
    }
    //return a student based on the given student ID
    public Student getStudent(int studentId){
        return studentDAO.findById(studentId).get();
    }

    //update the details of the student based on the student ID
    public Student updateStudentDetails(int studentId, Student student){
        student.setStudentId(studentId);
        return studentDAO.save(student);
    }

    //delete the student of the given ID
    public void deleteStudent(int studentId){
        studentDAO.deleteById(studentId);
    }
}

