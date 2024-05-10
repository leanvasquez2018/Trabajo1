package ar.org.centro8.curso.java.entities;

import lombok.Getter;

@Getter
public class AutoClasico extends Vehiculo{

    public AutoClasico(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public AutoClasico(String color, String marca, String modelo, double precio) {
        super(color, marca, modelo, precio);
    }
 
}
