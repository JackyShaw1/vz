package com.zzg.mybatis.generator.test;

public class Person {
    String name;
    String age;

    public Person() {
        System.out.println("person:"+name +age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void getInfo(){
        System.out.println("person getInfo");
    }
}
