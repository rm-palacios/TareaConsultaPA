package ThreadModel.hilos;

public class Hilo3 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("P");

            try {
                Hilo3.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Error en la clase Hilo3 " + e);
            }
        }
    }
}
