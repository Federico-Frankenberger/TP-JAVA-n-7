import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int num2;
        System.out.println("----------------------------------- \n¡Bienvenido al Trabajo Práctico 4!\n-----------------------------------");
        System.out.println("Grupo: 6 \nIntegrantes: - Miguel Barrera - Emilia Barros -  Federico Frankenberger  - Guadalupe Maricchiolo - \n-----------------------------------");
        System.out.println("-Ingrese-\n1 / Continuar \n2 / Salir\n-----------------------------------");
        do {
            num = sc.nextInt();
            switch (num) {
                case 1:
                    do {
                        System.out.println("------------\n EJERCICIOS \n------------");
                        System.out.println("-Ingrese-\n-- 1 o 2 para ejercicios\n-- 3 para salir");
                        num2 = sc.nextInt();
                        switch (num2) {
                            case 1:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 1:");
                                Ejercicio1.CargarNotas.main(args);
                                break;
                            case 2:
                                System.out.println("-------------------------------------");
                                System.out.println("Ejercicio 2:");
                                Ejercicio2.MenuRestaurant.main(args);
                                break;

                            case 3:
                                System.out.println("-------------------------------------");
                                System.out.println("Gracias por su corección!");
                                System.out.println("-------------------------------------");
                                num = 2;
                                break;
                            default:
                                System.out.println("--------------------------------------------------");
                                System.out.println("ERROR - número fuera de rango - vuleva a intentar!");
                                System.out.println("--------------------------------------------------");
                        }
                    } while (num != 2);
                case 2:
                    System.out.println("--------");
                    System.out.println("Gracias!");
                    System.out.println("--------");
                    break;
                default:
                    System.out.println("- Número fuera de rango - Intente nuevamente -\n1 / Continuar \n2 / Salir");
            }
        } while (num != 2);
    }
}