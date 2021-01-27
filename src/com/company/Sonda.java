package com.company;

import java.lang.Thread;
import java.util.Random;

public class Sonda extends Thread {

    private String nombre="";
    final int MIN=3000;
    final int MAX=6000-MIN;

    public void run(){
        Random r = new Random();
        Planeta p = new Planeta();
        try {
            int lanzamiento=0;
            int intentos=0;
            boolean fin=false;
            do {
                lanzamiento = r.nextInt(MAX)+MIN;
                sleep((long) lanzamiento);
                System.out.println(this.getName() + " avanza al siguiente planeta porque este no es habitable");
                intentos = intentos +1;
                fin = p.getHabit();
            }while(intentos<3 && !fin);

            if (fin){
                Habitable.pos1(this);
            }else System.out.println(this.getName() + " no hay combustible");

        }catch(InterruptedException var9){
            var9.printStackTrace();
        }
    }

    public String getNombr() {
        return nombre;
    }

    public boolean planetaEncontrado(Planeta x){
        if (x.getHabit()){
            return true;
        }else return false;
    }

    public void setNombre (String x){
        this.nombre = x;
    }

}
