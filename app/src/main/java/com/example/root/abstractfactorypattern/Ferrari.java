package com.example.root.abstractfactorypattern;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by root on 10/3/16.
 */
public class Ferrari implements Car {
    Context context;
    @Override
    public void type() {
        Toast.makeText(context,"Ferrari's Method",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void getC(Context c) {
        this.context=c;
    }
}
