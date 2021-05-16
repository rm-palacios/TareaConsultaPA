package ActorModel.actores;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Cliente extends UntypedActor {
    public enum Mensaje {
        ESPERANDO_ALIMENTOS
    }

    private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);
    private static final long TIEMPO_OBTENCION_ALIMENTOS = 2000;

    // El cliente recibe la orden de obtención de alimentos y se pone a ello.

    @Override
    public void onReceive(Object o) throws InterruptedException {
        log.info("[Cliente] ha recibido el mensaje: \"{}\".", o);

        if (o == Mensaje.ESPERANDO_ALIMENTOS) {
            log.info("[Cliente] está obteniendo alimentos...");
            obtenerMinerales();
            log.info("[Cliente] ha obtenido alimentos.");
        }
    }

    // El método sleep simula el tiempo que le lleva la tarea.
    private void obtenerMinerales() throws InterruptedException {
        Thread.sleep(TIEMPO_OBTENCION_ALIMENTOS);
    }
}
