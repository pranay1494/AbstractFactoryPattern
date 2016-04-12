package com.example.root.abstractfactorypattern;

/**
 * Created by root on 10/3/16.
 */
public class MusicFactory extends AbstractFactory {
    @Override
    Car getCar(String car) {
        return null;
    }

    @Override
    Music getMusic(String Music) {
        if(Music == null)
        {
            return null;
        }
        if(Music.equalsIgnoreCase("sweep"))
        {
            return new SweepMusic();
        }
        if(Music.equalsIgnoreCase("gun"))
        {
            return new Gun();
        }
        return null;
    }
}
