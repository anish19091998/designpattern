package com.anish.design.pattern.creational.factory;

public class ClientClass {

    public static void main(String args[]){

        ProfessionFactory professionFactory=new ProfessionFactory();
        Profession profession=professionFactory.getProfession("doc");
        profession.print();
        Profession profession1= professionFactory.getProfession("eng");
        profession1.print();
    }
}
