package ActorModel.actores;

import ActorModel.actores.Cliente;
import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Repartidor extends UntypedActor {
    public enum Mensaje {
        DESPACHAR_ALIMENTOS
    }

    private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);
    private ActorRef cliente;

    // Al igual que Tienda creaba a Repartidor en el método preStart, Repartidor hace lo propio con Cliente.
    // El repartidor recibe órdenes de despachar alimentos. Si el mensaje que recibe en onReceive es una de
    // estas órdenes, entonces pide al cliente que obtenga los alimentos que necesita.

    @Override
    public void preStart() {
        cliente = getContext().actorOf(Props.create(Cliente.class), "cliente");
    }

    @Override
    public void onReceive(Object o) throws InterruptedException {
        log.info("[Repartidor] ha recibido el mensaje: \"{}\".", o);

        if (o == Mensaje.DESPACHAR_ALIMENTOS) {
            cliente.tell(Cliente.Mensaje.ESPERANDO_ALIMENTOS, getSelf());
        }
    }
}
