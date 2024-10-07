package com.anish.design.pattern.creational.abstractactory;

public class TraineeAbstractFactory extends AbstractFactory{
    @Override
    Profession getProfession(String typeofprofession) {
        if("eng".equalsIgnoreCase(typeofprofession)){
            return new TraineeEngineer();
        }
        else if("tea".equalsIgnoreCase(typeofprofession)){
            return new TraineeTeacher();
        }
        return null;
    }
}
