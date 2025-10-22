package biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenidos al Sistema de Biblioteca!");
        System.out.println("1. Salir");
        System.out.println("Seleccione una opcion: ");
        try{
            int opcion = sc.nextInt();
            if(opcion == 1){
                System.out.println("Saliendo...");
            }else{
                System.out.println("Opción no válida");
            }

        } catch (java.util.InputMismatchException ex) {
            System.out.println("Error: Ingrese un número válido");
        }
        sc.close();
    }
}
