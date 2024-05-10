package ar.org.centro8.curso.java.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@AllArgsConstructor
public abstract class Vehiculo {
    
    private String color;
    private String marca;
    private String modelo;
    private double precio;
    private Radio radio;

    public Vehiculo(String color, String marca, String modelo){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
    }

    public Vehiculo(String color, String marca, String modelo, String marcaRadio, int potencia){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.radio=new Radio(marcaRadio, potencia);
    }

    public Vehiculo(String color, String marca, String modelo, double precio){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }

    public Vehiculo(String color, String marca, String modelo, double precio, String marcaRadio, int potencia){
        this.color=color;
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
        this.radio=new Radio(marcaRadio, potencia);
    }

    public void agregarRadio(String marcaRadio, int potencia){
        this.radio=new Radio(marcaRadio, potencia);
        System.out.println("Se agregó una radio al vehiculo!");
    }

    public void cambiarRadio(String marcaRadio, int potencia){
        this.radio=new Radio(marcaRadio, potencia);
        System.out.println("Se cambió la radio del vehiculo!");
    }

}
