package Maximiliano.Practicas.EjerciciosClase1;

import java.util.Scanner;

/*El programa lee por teclado una calificacion numerica entre 0 y 10 y muestra por pantalla su correspondiente calificacion alfabetica.

La equivalencia entre la calificacion numerica y la alfabetica se muestra en esta tabla:

0 <= nota < 5 Insuficiente
5 <= nota < 6 Suficiente
6 <= nota < 7 Bien
7 <= nota < 9 Notable
9 <= nota <= 10 Sobresaliente

La calificacion numerica que se introduce por teclado debe estar comprendida entre 0 y 10 para poder obtener su equivalente calificacion alfabetica. Si la calificacion introducida no es valida se muestra un mensaje indicandolo y el programa finaliza.
*/
public class ejercicio3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu calificacion");
        int calif = scanner.nextInt();
        if (calif >= 0 && calif < 5) {
            System.out.println("Tu calificacion es Insuficiente");
        }
        else if (calif >= 5 && calif < 6) {
            System.out.println("Tu calificacion es Suficiente");
        }
        else if (calif >= 6 && calif < 7) {
            System.out.println("Tu calificacion es Bien");
        }
        else if (calif >= 7 && calif < 9) {
            System.out.println("Tu calificacion es Notable");
        }
        else if (calif >= 9 && calif <= 10) {
            System.out.println("Tu calificacion es Sobresaliente");
        }
    }
}
