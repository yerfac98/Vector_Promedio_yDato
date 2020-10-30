
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Gerardo Fac
 */
public class FP_Exam_U_GerardoFacundo {

    public static void main(String[] args) {
        int N, numEv, suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        N = leerNum();

        int arr[] = new int[N];
        llenarMatriz(arr, N);
        mostrarMatriz(arr, N);
        promedio(arr, N);
        MAx_y_min(arr, N);

    }

    public static int leerNum() {
        int num = 0;
        Scanner leer = new Scanner(System.in);
        num = leer.nextInt();
        return num;

    }

    public static void llenarMatriz(int[] arr, int N) {
        Random azar = new Random();

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;

            arr[i] = azar.nextInt(8);

        }
    }

    public static void mostrarMatriz(int[] arr, int N) {
        Random azar = new Random();
        int suma = 0;
        System.out.println("Matriz numeros aleatorios");

        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + "\t");

        }
    }

    public static void promedio(int[] arr, int N) {
        int prom = 0,
                suma4 = 0;
        for (int i = 0; i < arr.length; i++) {
            suma4 = suma4 + arr[i];
        }

        prom = suma4 / N;
        System.out.println("");
        System.out.println("El promedio es: " + prom);

    }

    public static void MAx_y_min(int[] arr, int N) {
        int e,
                max,
                min,
                suma5;

        min = max = arr[0];

        for (e = 0; e < arr.length; e++) {
            if (min > arr[e]) {
                min = arr[e];
            }

            if (max < arr[e]) {
                max = arr[e];
            }
        }
        System.out.println("El numero maximo es: " + max);
        System.out.println("El numero minimo es:" + min);

    }
}
