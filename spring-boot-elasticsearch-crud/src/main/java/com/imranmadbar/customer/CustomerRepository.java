package com.imranmadbar.customer;

import java.util.List;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface CustomerRepository extends ElasticsearchRepository<CustomerEntity, String>{

    List<CustomerEntity> findByFirstname(String firstName);


}