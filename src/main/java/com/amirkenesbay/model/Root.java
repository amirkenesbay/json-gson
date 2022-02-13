package com.amirkenesbay.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.stream.Collectors;

public class Root {
    private String name;
    @SerializedName("people_list")
    private List<People> people;
    private People peoples;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<People> getPeople() {
        return people;
    }

    public void setPeople(List<People> people) {
        this.people = people;
    }

    public List<Integer> getAge(){
        return people.stream().map(People::getAge).toList();
    }
//    public List<Integer> age = people.stream().map(People::getAge).collect(Collectors.toList());

//    public List<Integer> getAge() {
//        return age;
//    }



    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}
