package ar.org.centro8.curso.java.entities;

import lombok.Getter;

@Getter
public class Colectivo extends Vehiculo{

    public Colectivo(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public Colectivo(String color, String marca, String modelo, double precio) {
        super(color, marca, modelo, precio);
    }
 
}
