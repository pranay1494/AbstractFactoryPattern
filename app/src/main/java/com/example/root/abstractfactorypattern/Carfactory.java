package com.example.root.abstractfactorypattern;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 10/3/16.
 */
public class Carfactory extends AbstractFactory {

    @Override
    Car getCar(String car) {
        if(car == null)
        {
            return null;
        }
        if(car.equalsIgnoreCase("Ferrari"))
        {
            return new Ferrari();
        }
        if(car.equalsIgnoreCase("Audi"))
        {
            return new Audi();
        }
        return null;
    }

    @Override
    Music getMusic(String Music) {
        return null;
    }
}
