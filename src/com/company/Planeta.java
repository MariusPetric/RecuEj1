package com.company;

import java.util.Random;

public class Planeta {

    static final int probHabit = 4;

    public Planeta(){

    }
    Random r = new Random();
    private String nombre ="";
    private int coordenada1= r.nextInt();
    private int coordenada2= r.nextInt();
    private int coordenada3= r.nextInt();
    private boolean habit=r.nextInt(probHabit)==0;

    public void setNombre(String x){
        this.nombre= x;
    }

    public String getNombre(){
        return nombre;
    }

    public boolean getHabit(){
        return habit;
    }

    public int getCoordenada1(){
        return coordenada1;
    }

    public int getCoordenada2(){
        return coordenada2;
    }

    public int getCoordenada3(){
        return coordenada3;
    }



}
