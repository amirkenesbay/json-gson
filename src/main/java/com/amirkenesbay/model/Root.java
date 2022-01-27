package com.amirkenesbay.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Root {
    private String name;
    @SerializedName("people_list")
    private List<People> people;

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

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", people=" + people +
                '}';
    }
}
