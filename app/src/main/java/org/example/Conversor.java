package org.example;
import java.awt.*;
import java.util.Scanner;
public class Conversor {
    private double temperatura;
    private String tipo;

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double calcular() {
        if (tipo.equals("C")) {
            return (temperatura - 32) * 0.55; // Fahrenheit to Celsius
        } else if (tipo.equals("F")) {
            return (temperatura * 1.8) + 32; // Celsius to Fahrenheit
        } else {
            throw new IllegalArgumentException("Tipo inválido. Use 'C' para Celsius ou 'F' para Fahrenheit.");
        }
    }


}
