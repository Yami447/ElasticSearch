package com.elastic.elasticsearch.repo;

import com.elastic.elasticsearch.model.Person;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;


public interface PersonRepo extends ElasticsearchRepository<Person, String> {
}
