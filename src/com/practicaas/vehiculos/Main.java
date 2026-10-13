package com.practicaas.vehiculos;

public class Main {

    public static void main(String[] args) {
        Vehiculo[] misVehiculos = new Vehiculo[4];

        misVehiculos[0] = new Vehiculo("12GB", "Ferrari", "A8");
        misVehiculos[1] = new VehiculoTurismo("12GB", "Ferrari", "A8", 4);
        misVehiculos[2] = new VehiculoDeportivo("12GB", "Ferrari", "A8", 1400);
        misVehiculos[3] = new VehiculoFurgoneta("12GB", "Ferrari", "A8", 2000);

        for (Vehiculo vehiculo : misVehiculos) {
            System.out.println(vehiculo.mostrarDatos());
            System.out.println("------------------------");
        }
    }
}
