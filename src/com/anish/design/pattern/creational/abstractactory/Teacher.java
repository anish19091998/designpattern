package com.anish.design.pattern.creational.abstractactory;

public class Teacher implements Profession{
    @Override
    public void getprofessiondesc() {
        System.out.println("I am a Teacher");
    }
}
