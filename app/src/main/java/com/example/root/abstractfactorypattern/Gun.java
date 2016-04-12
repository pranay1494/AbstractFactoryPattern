package com.example.root.abstractfactorypattern;

import android.content.Context;
import android.media.MediaPlayer;

/**
 * Created by root on 10/3/16.
 */
public class Gun implements Music {
    Context context;
    @Override
    public void play() {
        MediaPlayer mp = MediaPlayer.create(context, R.raw.gun);
        mp.start();
    }

    @Override
    public void getC(Context c) {
        this.context=c;
    }
}
