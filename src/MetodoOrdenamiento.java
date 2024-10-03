import java.util.Arrays;
import java.util.Scanner;
public class MetodoOrdenamiento {
    public int[] sortInserccion(int[] array, boolean logst) {
        int tamanio = array.length;
        for (int i = 1; i < tamanio; i++) {
            if (logst) {
                System.out.println("Pasada # " + i);
            }
            int aux = array[i];
            int j = i - 1;
            if (logst) {
                System.out.println("\ti=" + i + " j=" + j + " [i]=" + array[i] + " [j]=" + array[j]);
            }
            while (j >= 0 && array[j] > aux) {
                if (logst) {
                    System.out.println("\t\tComparamos " + aux + " con " + array[j]);
                }
                array[j + 1] = array[j];
                j--;
                if (logst) {
                    System.out.println("\t\t--------" + Arrays.toString(array));
                }
            }
            array[j + 1] = aux;
            if (logst) {
                System.out.println("\t--------" + Arrays.toString(array));
            }
        }
        return array;
    }
    public void imprimirArreglo(int[] arreglo) {
        System.out.println("Resultado  .......");
        for (int i : arreglo) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public int[] crearArreglo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de elementos del arreglo: ");
        int nElementos = scanner.nextInt();
        System.out.println("");
        int[] arreglo = new int[nElementos];
        for (int i = 0; i < nElementos; i++) {
            System.out.print("Introduce el elemento " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }
        return arreglo;
    }
}