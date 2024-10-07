package com.anish.design.pattern.creational.abstractactory;

public class ClientClass {
    public static void main(String args[]){

        AbstractFactory abstractFactory= MainAbstractFactoryProducer.getprofession(true);
        Profession profession=abstractFactory.getProfession("tea");
        profession.getprofessiondesc();

    }
}
