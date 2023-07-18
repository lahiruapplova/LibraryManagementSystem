package com.example.librarymanagementsystemmaven.resource;

import com.example.librarymanagementsystemmaven.model.Student;
import com.example.librarymanagementsystemmaven.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/student")
public class StudentResource {
    @Autowired
    StudentService studentService;

    @PostMapping
    public Student addStudent(@RequestBody Student student){
        return studentService.addAStudent(student);
    }
    @GetMapping
    public List<Student> getStudentList(){
        return  studentService.returnStudetnList();
    }
    @GetMapping(value="/{studentId}")
    public Student getStudent(@PathVariable("studentId") int studentId){
        return studentService.getStudent(studentId);
    }
    @PutMapping(value="/{studentId}")
    public Student updateStudentDetails(@PathVariable int studentId,@RequestBody Student student){
        student.setStudentId(studentId);
        return studentService.updateStudentDetails(studentId,student);
    }
    @DeleteMapping(value="/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
    }
}
