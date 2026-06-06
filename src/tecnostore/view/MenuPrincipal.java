/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tecnostore.view;

/**
 *
 * @author merch
 */

import java.util.Scanner;

public class MenuPrincipal {

    private Scanner scanner;
    private MenuCelulares menuCelulares;
    private MenuClientes menuClientes;
    private MenuVentas menuVentas;

    public MenuPrincipal() {
        this.scanner = new Scanner(System.in);
        this.menuCelulares = new MenuCelulares(scanner);
        this.menuClientes = new MenuClientes(scanner);
        this.menuVentas = new MenuVentas(scanner);
    }

    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n========================================");
            System.out.println("        BIENVENIDO A TECNOSTORE         ");
            System.out.println("========================================");
            System.out.println("1. Gestion de Celulares");
            System.out.println("2. Gestion de Clientes");
            System.out.println("3. Gestion de Ventas");
            System.out.println("0. Salir");
            System.out.println("========================================");
            System.out.print("Opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1: menuCelulares.mostrarMenu(); break;
                case 2: menuClientes.mostrarMenu(); break;
                case 3: menuVentas.mostrarMenu(); break;
                case 0: System.out.println("Hasta luego."); break;
                default: System.out.println("Opcion no válida.");
            }
        } while (opcion != 0);
    }
}