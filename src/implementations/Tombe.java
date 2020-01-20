package implementations;

import interfaces.Catel;

public class Tombe implements Catel {

    @Override
    public void bark() {
        System.out.println("Tombe is barking");
    }

    @Override
    public void breathe() {
        System.out.println("Tombe is breathing");
    }
}
