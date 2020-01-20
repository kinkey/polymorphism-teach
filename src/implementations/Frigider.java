package implementations;

import interfaces.Catel;

public class Frigider implements Catel {

    @Override
    public void bark() {
        System.out.println("Frigi is barking");
    }

    @Override
    public void breathe() {
        System.out.println("Frigi is breathing");
    }
}
