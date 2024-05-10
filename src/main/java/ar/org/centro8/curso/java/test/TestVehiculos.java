package ar.org.centro8.curso.java.test;

import ar.org.centro8.curso.java.entities.AutoClasico;
import ar.org.centro8.curso.java.entities.AutoNuevo;
import ar.org.centro8.curso.java.entities.Colectivo;

public class TestVehiculos {
    public static void main(String[] args) {
        //Objetos MOCKS (Objetos Simulados)

        System.out.println("-- autoclasico1 --");
        AutoClasico autoclasico1=new AutoClasico("Naranja", "Fiat", "Barchetta");
        autoclasico1.agregarRadio("Sony", 19);
        System.out.println(autoclasico1);

        System.out.println("-- autoclasico2 --");
        AutoClasico autoclasico2=new AutoClasico("Amarillo", "Ford", "Royale", 10000);
        autoclasico2.agregarRadio("Brauline", 26);
        System.out.println(autoclasico2);

        System.out.println("-- autonuevo1 --");
        AutoNuevo autonuevo1=new AutoNuevo("Negro", "Chevrolet", "Corvette", "Garmin", 25);
        autonuevo1.cambiarRadio("Nakamichi", 80);
        System.out.println(autonuevo1);

        System.out.println("-- autonuevo2 --");
        AutoNuevo autonuevo2=new AutoNuevo("Azul", "Toyota", "Innova", 500000, "Pioneer", 50);
        autonuevo2.cambiarRadio("Omnitek", 100);
        System.out.println(autonuevo2);

        System.out.println("-- colectivo1 --");
        Colectivo colectivo1=new Colectivo("Rojo", "Mercedes-Benz", "Vaneo");
        colectivo1.agregarRadio("Dekkin", 36);
        System.out.println(colectivo1);

        System.out.println("-- colectivo2 --");
        Colectivo colectivo2=new Colectivo("Verde", "Peugeot", "Onyx", 900000);
        colectivo2.agregarRadio("Gadnic", 48);
        System.out.println(colectivo2);

    }

}
