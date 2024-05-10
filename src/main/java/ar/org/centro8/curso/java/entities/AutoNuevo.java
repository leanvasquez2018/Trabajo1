package ar.org.centro8.curso.java.entities;

import lombok.Getter;

@Getter
public class AutoNuevo extends Vehiculo{

    public AutoNuevo(String color, String marca, String modelo, String marcaRadio, int potencia) {
        super(color, marca, modelo, marcaRadio, potencia);
    }

    public AutoNuevo(String color, String marca, String modelo, double precio, String marcaRadio, int potencia) {
        super(color, marca, modelo, precio, marcaRadio, potencia);
    }
 
}
