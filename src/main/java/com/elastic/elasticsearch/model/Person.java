package com.elastic.elasticsearch.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "person")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
    @Id
    @Field(type = FieldType.Keyword)
    String id;
    @Field(type = FieldType.Text)
    String name;

//    public String getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
}

