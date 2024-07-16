package Maximiliano.Practicas.EjerciciosClase4;

// Ejercicio02
// Programa que genera un array de 8 enteros aleatorios entre 1 y 10,
// lo ordena utilizando el algoritmo de ordenamiento de burbuja y lo muestra.
public class ejercicio2_clase4 {

    public static void main(String[] args) {
        int[] array = new int[8];
        for (int i = 0; i < 8; i++) {
            array[i] = (int) (Math.random() * 10) + 1;
        }

        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < 8 - 1; i++) { // Ajustar el límite del bucle externo
            for (int j = 0; j < 8 - 1 - i; j++) { // Ajustar el límite del bucle interno
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        for (int i = 0; i < 8; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
