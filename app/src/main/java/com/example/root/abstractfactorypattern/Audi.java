package com.example.root.abstractfactorypattern;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 10/3/16.
 */
public class Audi implements Car {
    Context c;
    @Override
    public void type() {
        Toast.makeText(c, "Audi's Method", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void getC(Context c) {
        this.c = c;
    }
}
