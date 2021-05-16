package ActorModel.actores;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.event.Logging;
import akka.event.LoggingAdapter;

public class Tienda extends UntypedActor {

    private final LoggingAdapter log = Logging.getLogger(getContext().system(), this);

    // Los actores de Akka tienen un método preStart que podemos sobreescribir para realizar
    // acciones previas a la recepción del primer mensaje que reciban.
    // En el caso del Actor 1, queremos que diga al Actor 2 que le cree una espada.

    // La creación de actores desde otros actores se realiza a través del método actorOf,
    // al que se le pasan como parámetros una instancia de la clase de configuración Props
    // y el nombre del actor a crear, que debe ser único. El método actorOf devuelve una
    // instancia de ActorRef, es decir, una referencia al actor que ha sido creado.
    // A través de su método tell, se le pueden mandar mensajes. A este método se le pasa
    // la referencia del propio actor que envía el mensaje, la cual se puede conseguir llamando
    // a getSelf. De esta manera, el receptor del mensaje podrá saber quién se lo ha enviado llamando a getSender.

    @Override
    public void preStart() {
        final ActorRef a2 = getContext().actorOf(Props.create(Repartidor.class), "repartidor");
        a2.tell(Repartidor.Mensaje.DESPACHAR_ALIMENTOS, getSelf());
    }
    //Método donde los actores reciben los mensajes y los manejan según corresponda.
    @Override
    public void onReceive(Object o) {
        log.info("[Tienda] ha recibido el mensaje: \"{}\".", o);
    }
}