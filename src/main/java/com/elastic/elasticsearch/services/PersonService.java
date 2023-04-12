package com.elastic.elasticsearch.services;

import com.elastic.elasticsearch.model.Person;
import com.elastic.elasticsearch.repo.PersonRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    @Autowired
    PersonRepo personRepo;
    public Person addPerson(Person person){
        System.out.println(person.getClass().getSimpleName());
        System.out.println("yes");
        return personRepo.save(person);
    }

    public Person fetchPerson(String id) throws Exception{
        return personRepo.findById(id).orElseThrow(()-> new Exception("Not found!"));
    }
}
