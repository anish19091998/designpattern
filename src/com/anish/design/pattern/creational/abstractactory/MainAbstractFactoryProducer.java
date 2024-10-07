package com.anish.design.pattern.creational.abstractactory;

public class MainAbstractFactoryProducer {

    public static AbstractFactory getprofession(boolean isTrainee){
        if(isTrainee){
            return new TraineeAbstractFactory();
        }
        else {
            return new
                    ProfessionalAbstractFactory();
        }
    }
}
