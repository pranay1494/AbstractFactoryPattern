package com.example.root.abstractfactorypattern;

/**
 * Created by root on 10/3/16.
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){

        if(choice.equalsIgnoreCase("Music")){
            return new MusicFactory();

        }else if(choice.equalsIgnoreCase("Car")){
            return new Carfactory();
        }

        return null;
    }
}
