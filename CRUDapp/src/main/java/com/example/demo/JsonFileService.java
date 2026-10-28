package com.example.demo;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

@Service
public class JsonFileService {

    private final String FILE_PATH = "students.json";
    private ObjectMapper mapper = new ObjectMapper();

    public List<Student> readStudents() {
        try {
            File file = new File(FILE_PATH);
            if (!file.exists()) return new ArrayList<>();
            return mapper.readValue(file, new TypeReference<List<Student>>() {});
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public void writeStudents(List<Student> students) {
        try {
            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new File(FILE_PATH), students);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
