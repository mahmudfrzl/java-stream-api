package com.stream;

public class Person {
    private String name;
    private String nationality;
    private int age;

    public Person(String name, String nationality, int age) {
        this.name = name;
        this.nationality = nationality;
        this.age = age;
    }

    public Person(String name, int age) {
            this(name,"",age);
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return nationality;
    }

    public int getAge() {
        return age;
    }
}
