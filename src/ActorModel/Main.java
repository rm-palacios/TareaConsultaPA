package ActorModel;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        akka.Main.main(new String[]{Actor1.class.getName()});
    }
}
