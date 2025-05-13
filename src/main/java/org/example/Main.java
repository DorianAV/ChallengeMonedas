package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicioMoneda servicio = new ServicioMoneda("168d02a2f08f096e581287eb");
        Menu menu = new Menu(scanner, servicio);

        menu.iniciar();
    }
}