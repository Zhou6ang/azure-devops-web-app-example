package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends CrudRepository<Greeting, Long> {
    // for now only using default CRUD methods
}   