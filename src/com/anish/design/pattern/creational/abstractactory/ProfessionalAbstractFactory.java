package com.anish.design.pattern.creational.abstractactory;

public class ProfessionalAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String typeofprofession) {
        if("eng".equalsIgnoreCase(typeofprofession)){
            return new Engineer();
        }
        else if("tea".equalsIgnoreCase(typeofprofession)){
            return new Teacher();
        }
        return null;
    }
}
