package ar.org.centro8.curso.java.entities;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString

public class Radio {
    
    private String marca;
    private int potencia;

public Radio(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

}
