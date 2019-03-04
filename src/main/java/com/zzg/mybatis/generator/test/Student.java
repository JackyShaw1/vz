package com.zzg.mybatis.generator.test;

public class Student extends Person{
    String toy;


    public Student() {
        System.out.println("student"+toy);
    }

    public Student(String toy) {
        this.toy = toy;
        System.out.println(toy);
    }

    public String getToy() {
        return toy;
    }

    public void setToy(String toy) {
        this.toy = toy;
    }

    public void getInfo(){
        System.out.println("student getInfo");
    }

    @Override
    public String toString() {
        return "Student{" +
                "toy='" + toy + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
