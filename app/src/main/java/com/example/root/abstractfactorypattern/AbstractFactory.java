package com.example.root.abstractfactorypattern;

import android.content.Context;

/**
 * Created by root on 10/3/16.
 */
public abstract class AbstractFactory {
    abstract Car getCar(String car);
    abstract Music getMusic(String Music);
}
