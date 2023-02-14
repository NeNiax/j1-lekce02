package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód

        // toto je řádek, který domeček postaví
        //zofka.turnRight(90);

        // udělá čtvereček
        zofka.turnRight(180);
        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        //přidá střechu
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(70);

        // tady se přidají nožičky
        nozicka();
        zofka.turnRight(30);
        zofka.move(100);
        zofka.turnRight(30);
        nozicka();

    }

    private void nozicka() {
        zofka.move(25);
        zofka.turnRight(180);
        zofka.move(25);
        zofka.turnLeft(75);
        zofka.move(25);
        zofka.turnLeft(180);
        zofka.move(25);
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
