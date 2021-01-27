package com.company;

import java.util.concurrent.Semaphore;

public class Habitable {

    private static final Semaphore habitable = new Semaphore(1, true);

    public Habitable() {
    }

    public static void pos1(Sonda sonda) throws InterruptedException {
        habitable.acquire();
        System.out.println(sonda.getName() + " hay un planeta habitable"  );
    }

}
