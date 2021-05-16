package ThreadModel;

import ThreadModel.hilos.Hilo1;
import ThreadModel.hilos.Hilo2;
import ThreadModel.hilos.Hilo3;
import ThreadModel.hilos.Hilo4;

public class Main {
    public static void main(String[] args) {

        Hilo1 hilo1 = new Hilo1();
        Hilo2 hilo2 = new Hilo2();
        Hilo3 hilo3 = new Hilo3();
        Hilo4 hilo4 = new Hilo4();

        //Hilo1
        hilo1.start();
        try {
            hilo1.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo1 " + e);
        }

        //Hilo2
        hilo2.start();
        try {
            hilo2.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo2 " + e);
        }

        //Hilo3
        hilo3.start();
        try {
            hilo3.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo3 " + e);
        }

        //Hilo4
        hilo4.start();
        try {
            hilo4.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("Error en el hilo4 " + e);
        }
    }
}
