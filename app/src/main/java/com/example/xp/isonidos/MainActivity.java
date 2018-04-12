package com.example.xp.isonidos;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SoundPool sonidos;
    int sonido1;
//    ArrayList <Integer> listaInt = new ArrayList();
//    Field[] son = R.raw.class.getFields();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonidos = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
//        listaInt = sonidos.load(R.raw.simpsons_klab01, 1, 1);
        switch (sonido1)
        {
            //case 0: sonidos.load(this, R.raw.simpsons_klab01, 1, 1);
            //break;
        }
    }

    public void sonido(View vista)
    {
//        MediaPlayer mp = MediaPlayer.create(this, R.raw.simpsons_correplatano);
//        mp.start();
        sonidos.play(sonido1,1,1,1,0, 1);

    }
}
