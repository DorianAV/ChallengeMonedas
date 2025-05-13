package org.example;

import java.util.Scanner;

public class Menu {
    private final Scanner scanner;
    private final ServicioMoneda servicio;

    public Menu(Scanner scanner, ServicioMoneda servicio) {
        this.scanner = scanner;
        this.servicio = servicio;
    }

    public void iniciar() {
        while (true) {
            System.out.println("\n****************************************************");
            System.out.println("Sea bienvenido/a al Conversor de Moneda =]");
            System.out.println("1) Dólar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dólar");
            System.out.println("3) Dólar =>> Real brasileño");
            System.out.println("4) Real brasileño =>> Dólar");
            System.out.println("5) Dólar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dólar");
            System.out.println("7) Dólar =>> Peso mexicano");
            System.out.println("8) Peso mexicano =>> Dólar");
            System.out.println("9) Salir");
            System.out.print("Elija una opción válida: ");
            System.out.println("****************************************************\n");

            int opcion = scanner.nextInt();

            if (opcion == 9) {
                System.out.println("¡Gracias por usar el conversor!");
                break;
            }

            String desde = "", hacia = "";
            switch (opcion) {
                case 1 -> { desde = "USD"; hacia = "ARS"; }
                case 2 -> { desde = "ARS"; hacia = "USD"; }
                case 3 -> { desde = "USD"; hacia = "BRL"; }
                case 4 -> { desde = "BRL"; hacia = "USD"; }
                case 5 -> { desde = "USD"; hacia = "COP"; }
                case 6 -> { desde = "COP"; hacia = "USD"; }
                case 7 -> { desde = "USD"; hacia = "MXN"; }
                case 8 -> { desde = "MXN"; hacia = "USD"; }
                default -> {
                    System.out.println("Opción inválida.");
                    continue;
                }
            }

            System.out.print("Ingrese la cantidad que deseas convertir: ");
            double cantidad = scanner.nextDouble();
            double resultado = servicio.convertir(desde, hacia, cantidad);

            if (resultado != -1) {
                System.out.printf("El valor %.2f [%s] equivale a >>> %.2f [%s]%n", cantidad, desde, resultado, hacia);
            } else {
                System.out.println("Error al obtener el tipo de cambio. Intente más tarde.");
            }
        }
    }
}
