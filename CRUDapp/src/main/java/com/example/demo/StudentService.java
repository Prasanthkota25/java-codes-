package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
    private JsonFileService jsonFileService;

    public StudentService(JsonFileService jsonFileService) {
        this.jsonFileService = jsonFileService;
    }

    public List<Student> getAllStudents() {
        return jsonFileService.readStudents();
    }

    public Student getStudentById(int id) {
        return jsonFileService.readStudents()
                .stream()
                .filter(s -> s.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Student addStudent(Student student) {
        List<Student> students = jsonFileService.readStudents();
        students.add(student);
        jsonFileService.writeStudents(students);
        return student;
    }

    public Student updateStudent(int id, Student updatedStudent) {
        List<Student> students = jsonFileService.readStudents();

        for (Student s : students) {
            if (s.getId() == id) {
                s.setName(updatedStudent.getName());
                s.setCourse(updatedStudent.getCourse());
                jsonFileService.writeStudents(students);
                return s;
            }
        }
        return null;
    }

    public boolean deleteStudent(int id) {
        List<Student> students = jsonFileService.readStudents();
        boolean removed = students.removeIf(s -> s.getId() == id);
        if (removed) {
            jsonFileService.writeStudents(students);
        }
        return removed;
    }
}
