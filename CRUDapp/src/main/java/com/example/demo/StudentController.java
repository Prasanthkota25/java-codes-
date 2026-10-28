package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {

	@Autowired
    private  StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }

    @PostMapping("/")
    public Student create(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable int id, @RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        return studentService.deleteStudent(id) 
               ? "Deleted Successfully" 
               : "Student Not Found";
    }
}
