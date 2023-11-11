package Week_7;

// Define an interface named "Playable" for objects that can be played.
interface Playable {
    void play();
}

// Create two classes that implement the "Playable" interface.
class Guitar implements Playable {
    public void play() {
        System.out.println("Playing the guitar.");
    }
}

class Piano implements Playable {
    public void play() {
        System.out.println("Playing the piano.");
    }
}

// Create a class that uses objects implementing the "Playable" interface.
class Musician {
    public void perform(Playable instrument) {
        System.out.print("The musician is ");
        instrument.play();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Musician john = new Musician();
        Playable guitar = new Guitar();
        Playable piano = new Piano();

        john.perform(guitar);
        john.perform(piano);
    }
}

