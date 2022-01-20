package com.imranmadbar.student;

import com.imranmadbar.customer.CustomerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository repository;

    @PostMapping("/save")
    public StudentEntity save(@RequestBody StudentEntity studObj) {
        repository.save(studObj);
        return studObj;
    }

    @GetMapping("/findAll")
    public Iterable<StudentEntity> findAll() {
        return repository.findAll();
    }

    @GetMapping("/find-by-id/{id}")
    public Optional<StudentEntity> findById(@PathVariable String id) {
        return repository.findById(id);
    }



}
