package com.imranmadbar.student;

import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;



@ToString
@Document(indexName="school_indx",type="student",shards=5)
public class StudentEntity  implements Serializable {

    private static final long serialVersionUID = -4538971070304943261L;

    @Id
    private String id;
    private String name;
    private String gender;
    private int age;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
