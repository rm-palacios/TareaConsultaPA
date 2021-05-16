package ActorModel;

import ActorModel.actores.Tienda;

public final class Main {

    // El método main de Akka recibe como argumento el nombre de la clase
    // del actor principal de la aplicación, que será el que comience ejecutándose.
    // En nuestro caso será Tienda.

    private Main() {}

    public static void main(String[] args) {
        akka.Main.main(new String[]{Tienda.class.getName()});
    }
}
