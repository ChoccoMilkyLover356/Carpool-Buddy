package com.example.carpoolbuddy;

public class Trial {
    private int age;

    public Trial(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Trial{" +
                "age=" + age +
                '}';
    }
}
