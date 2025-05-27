interface Playable {
    void play();
}

class Guitar implements Playable {
    @Override
    public void play() {
        System.out.println("Guitar is playing");
    }
}

class Piano implements Playable {
    @Override
    public void play() {
        System.out.println("Piano is playing");
    }
}

public class InterfaceImplementation {
    public static void main(String[] args) {
        Playable g = new Guitar();
        Playable p = new Piano();

        g.play();
        p.play();
    }
}
