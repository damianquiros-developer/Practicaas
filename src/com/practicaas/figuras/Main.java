package com.practicaas.figuras;

public class Main {

    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Rectangulo(5, 3);
        figuras[1] = new Circunferencia(4);
        figuras[2] = new Triangulo(6, 4);

        for (Figura figura : figuras) {
            System.out.printf("%s - Area: %.2f%n", figura.getClass().getSimpleName(), figura.calcularArea());
        }
    }
}
