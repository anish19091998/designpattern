package com.anish.design.pattern.creational.abstractactory;

public class Engineer implements Profession{

    @Override
    public void getprofessiondesc() {
        System.out.println("I am an engineer");
    }
}