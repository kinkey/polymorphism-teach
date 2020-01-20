import implementations.Frigider;
import implementations.Tombe;
import interfaces.Animal;
import interfaces.Catel;

public class DualDogRunner {

    public static void main(String[] args) {
        Catel tombe = new Tombe();

        tombe.bark();

        System.out.println("Recievig animals");
        recieveAnimals(tombe);

        System.out.println("Recieving catei");
        recieveDog(tombe);
    }

    public static void recieveAnimals(Animal animal){
        animal.breathe();
    }

    public static void recieveDog(Catel catel){
        catel.breathe();
        catel.bark();
    }
}
