package ActorModel;

import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Actor3 extends UntypedActor {
    public enum Mensaje {
        OBTENER_MATERIALES
    }

    private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);
    private static final long TIEMPO_OBTENCION_MATERIALES = 2000;

    @Override
    public void onReceive(Object o) throws InterruptedException {
        log.info("[Minero] ha recibido el mensaje: \"{}\".", o);

        if (o == Mensaje.OBTENER_MATERIALES) {
            log.info("[Minero] está obteniendo materiales...");
            obtenerMinerales();
            log.info("[Minero] ha obtenido materiales.");
        }
    }

    private void obtenerMinerales() throws InterruptedException {
        Thread.sleep(TIEMPO_OBTENCION_MATERIALES);
    }
}
