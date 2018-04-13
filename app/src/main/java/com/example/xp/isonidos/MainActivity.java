package com.example.xp.isonidos;

import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SoundPool sonidos;
    int sonido1, sonido2, sonido3, sonido4, sonido5;
    int sonido6, sonido7, sonido8, sonido9, sonido10;
//    int imagen1, imagen2, imagen3, imagen4, imagen5;
//    int imagen6, imagen7, imagen8, imagen9, imagen10;
//    ArrayList <Integer> listaInt = new ArrayList();
//    Field[] son = R.raw.class.getFields();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sonidos = new SoundPool(4, AudioManager.STREAM_MUSIC, 0);
        sonido1 = sonidos.load(this, R.raw.sonido1, 1);
        sonido2 = sonidos.load(this, R.raw.sonido2, 1);
        sonido3 = sonidos.load(this, R.raw.sonido3, 1);
        sonido4 = sonidos.load(this, R.raw.sonido4, 1);
        sonido5 = sonidos.load(this, R.raw.sonido5, 1);
        sonido6 = sonidos.load(this, R.raw.sonido6, 1);
        sonido7 = sonidos.load(this, R.raw.sonido7, 1);
        sonido8 = sonidos.load(this, R.raw.sonido8, 1);
        sonido9 = sonidos.load(this, R.raw.sonido9, 1);
        sonido10 = sonidos.load(this, R.raw.sonido10, 1);
    }

    public void sonido(View vista)
    {
//        MediaPlayer mp = MediaPlayer.create(this, R.raw.simpsons_correplatano);
//        mp.start();
        Button boton = (Button)findViewById(vista.getId());
        int idSonido = Integer.valueOf(boton.getTag().toString());
        switch (idSonido)
        {
            case 0: sonidos.play(sonido1, 1, 1, 1, 0, 1);
            break;
            case 1: sonidos.play(sonido2, 1, 1, 1, 0, 1);
            break;
            case 2: sonidos.play(sonido3, 1, 1, 1, 0, 1);
            break;
            case 3: sonidos.play(sonido4, 1, 1, 1, 0, 1);
            break;
            case 4: sonidos.play(sonido5, 1, 1, 1, 0, 1);
            break;
            case 5: sonidos.play(sonido6, 1, 1, 1, 0, 1);
            break;
            case 6: sonidos.play(sonido7, 1, 1, 1, 0, 1);
            break;
            case 7: sonidos.play(sonido8, 1, 1, 1, 0, 1);
            break;
            case 8: sonidos.play(sonido9, 1, 1, 1, 0, 1);
            break;
            case 9: sonidos.play(sonido10, 1, 1, 1, 0, 1);
            break;
            default: sonidos.play(sonido1, 1, 1, 1, 0, 1);
            break;
        }
    }

//   public void imagen(View vista)
//    {
//        Button boton = (Button)findViewById(vista.getId());
//        int idImagen = Integer.valueOf(boton.getTag().toString());
//        switch(idImagen)
//        {
//            case 0:
//        }
//    }
}
