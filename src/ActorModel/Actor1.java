package ActorModel;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Actor1 extends UntypedActor {

    private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);

    @Override
    public void preStart() {
        final ActorRef herrero = getContext().actorOf(Props.create(Actor2.class), "herrero");
        herrero.tell(Actor2.Mensaje.CREAR_ESPADA, getSelf());
    }

    @Override
    public void onReceive(Object o) {
        log.info("[Espadachin] ha recibido el mensaje: \"{}\".", o);
    }
}