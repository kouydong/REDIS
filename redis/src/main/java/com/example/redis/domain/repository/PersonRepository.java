package com.example.redis.domain.repository;

import com.example.redis.domain.entity.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonRepository extends CrudRepository<Person, String> {

}
