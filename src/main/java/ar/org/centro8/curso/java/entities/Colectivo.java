package ar.org.centro8.curso.java.entities;

import lombok.Getter;

@Getter
public class Colectivo extends Vehiculo{

    private Radio radio;

    public Colectivo(String color, String marca, String modelo) {
        super(color, marca, modelo);
    }

    public Colectivo(String color, String marca, String modelo, double precio) {
        super(color, marca, modelo, precio);
    }

    @Override
    public void agregarRadio(String marcaRadio, int potencia){
        this.radio=new Radio(marcaRadio, potencia);
        System.out.println("Se agregó una radio al vehiculo!");
    }

    @Override
    public void cambiarRadio(String marcaRadio, int potencia){
        this.radio=new Radio(marcaRadio, potencia);
        System.out.println("Se cambió la radio del vehiculo!");
    }
 
}
