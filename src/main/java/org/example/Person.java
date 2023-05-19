package org.example;

public class Person {
    String name = "";
    String surname = "";
    int age = 0;
    double money =0;

    public String toString() {
        return this.name + " " + this.surname + " is " + this.age + " years old";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
