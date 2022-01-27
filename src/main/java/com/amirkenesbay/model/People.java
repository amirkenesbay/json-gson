package com.amirkenesbay.model;

public class People {
    private String name;
    private int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Root{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
