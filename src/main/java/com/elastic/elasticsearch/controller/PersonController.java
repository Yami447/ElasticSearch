package com.elastic.elasticsearch.controller;

import com.elastic.elasticsearch.model.Person;
import com.elastic.elasticsearch.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;
    @PostMapping("/persons")
    public Person addPerson(@RequestBody Person person){
        return personService.addPerson(person);
    }
}
