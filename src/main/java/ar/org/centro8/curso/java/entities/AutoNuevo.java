package ar.org.centro8.curso.java.entities;

import lombok.Getter;

@Getter
public class AutoNuevo extends Vehiculo{

    private Radio radio;

    public AutoNuevo(String color, String marca, String modelo, Radio radio, String marcaRadio, int potencia) {
        super(color, marca, modelo, marcaRadio, potencia);
    }

    public AutoNuevo(String color, String marca, String modelo, double precio, Radio radio, String marcaRadio, int potencia) {
        super(color, marca, modelo, precio, marcaRadio, potencia);
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
