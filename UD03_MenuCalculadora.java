import java.util.Scanner;
/*
PARTE 1 - DISEÑO

1. Usaré do while porque el menú tiene que aparecer al menos una vez y repetirse hasta elegir FIN.

2. Usaré switch porque permite elegir entre las diferentes operaciones del menú.

3. Usaré if para comprobar si el segundo número es cero justo antes de realizar la división.

4. Pasos:
1. Iniciar el programa.
2. Mostrar el menú.
3. Pedir una opción(1,2,3,4,5).
4. Comprobar la opción con switch.
5. Pedir dos números si hay una operación.
6. Realizar la operación.
7. Comprobar que no se divida entre cero.
8. Mostrar el resultado o el error.
9. Avisar si la opción no existe.
10. Repetir hasta elegir 5.
11. Despedirse y terminar.
*/

public class UD03_MenuCalculadora {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion = 0;
        double num1, num2;

        do {
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - FIN");

            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.print("Primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextDouble();

                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.print("Primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextDouble();

                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case 3:
                    System.out.print("Primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextDouble();

                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case 4:
                    System.out.print("Primer numero: ");
                    num1 = sc.nextDouble();
                    System.out.print("Segundo numero: ");
                    num2 = sc.nextDouble();

                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: no se puede dividir entre cero.");
                    }
                    break;

                case 5:
                    System.out.println("Adios!");
                    break;

                default:
                    System.out.println("Opcion no valida, intenta otra vez.");
            }
            System.out.println();

        } while (opcion != 5);
        sc.close();
    }
}