package com.anish.design.pattern.creational.factory;

public class ProfessionFactory {
     public Profession getProfession(String professiontype){
         if("eng".equalsIgnoreCase(professiontype)){
             return new Engineer();
         }
         else if("doc".equalsIgnoreCase(professiontype)){
             return new Doctor();
         }
         return null;
     }


}
