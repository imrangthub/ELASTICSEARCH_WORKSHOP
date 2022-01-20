package com.imranmadbar.student;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Optional;


public interface StudentRepository extends ElasticsearchRepository<StudentEntity, String>{

    Optional<StudentEntity> findById(String id);


}