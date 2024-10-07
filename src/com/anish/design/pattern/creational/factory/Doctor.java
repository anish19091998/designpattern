package com.anish.design.pattern.creational.factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am doctor by profession");
    }
}
