package com.example.softheart.class_test;

import android.util.Log;

public class Person {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void read(){
        Log.d("person", "this is person can read without parameter.");
    }

    public void read(int personId){
        Log.d("student", "this is overloading example with person id. ");
    }
}
