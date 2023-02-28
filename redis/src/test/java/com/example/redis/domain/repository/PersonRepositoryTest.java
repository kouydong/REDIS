package com.example.redis.domain.repository;

import com.example.redis.domain.entity.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PersonRepositoryTest {
    @Autowired
    private PersonRepository personRepository;

    @Test
    @DisplayName("Redis 사용")
    void test() {
        Person person = new Person("Park", 20);

        // 저장
        personRepository.save(person);

        // `keyspace:id` 값을 가져옴
        //personRepository.findById(person.getId());

        // Person Entity 의 @RedisHash 에 정의되어 있는 keyspace (people) 에 속한 키의 갯수를 구함
        //personRepository.count();

        // 삭제
//        personRepository.delete(person);
    }
}