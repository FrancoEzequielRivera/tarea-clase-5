import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // punto A

        /*
        int num1 = Integer.parseInt(args[1]);
        int num2 = Integer.parseInt(args[2]);
        int num3 = Integer.parseInt(args[3]);

        String orden = args[0];
        ordenar(num1, num2, num3, orden);
         */

        // punto B

        /*
        Scanner pedir = new Scanner(System.in);

        System.out.println("Ingrese primer numero");
        num1 = pedir.nextInt();

        System.out.println("Ingrese segundo numero");
        num2 = pedir.nextInt();

        System.out.println("Ingrese tercer numero");
        num3 = pedir.nextInt();
        pedir.nextLine();

        System.out.println("Ingrese orden, ascendente o descendente");
        orden = pedir.nextLine();

        pedir.close();
        ordenar(num1, num2, num3, orden);
         */

        // punto C

        int num1;
        int num2;
        int num3;
        String orden;

        if (args.length != 0){
            orden = args[0];
            num1 = Integer.parseInt(args[1]);
            num2 = Integer.parseInt(args[2]);
            num3 = Integer.parseInt(args[3]);
            ordenar(num1, num2, num3, orden);
        }
        else{
            Scanner pedir = new Scanner(System.in);

            System.out.println("Ingrese primer numero");
            num1 = pedir.nextInt();

            System.out.println("Ingrese segundo numero");
            num2 = pedir.nextInt();

            System.out.println("Ingrese tercer numero");
            num3 = pedir.nextInt();
            pedir.nextLine();

            System.out.println("Ingrese orden, ascendente o descendente");
            orden = pedir.nextLine();

            pedir.close();
            ordenar(num1, num2, num3, orden);
        }


    }

    public static int[] ordenar(int n1, int n2, int n3, String orden){
        int[] vector = {n1, n2, n3};
        if (orden.equals("ascendente")) {
            Arrays.sort(vector);
        } else if (orden.equals("descendente")) {
            Arrays.sort(vector);
            for (int i = 0; i < vector.length / 2; i++) {
                int temp = vector[i];
                vector[i] = vector[vector.length - 1 - i];
                vector[vector.length - 1 - i] = temp;
            }
        }

        System.out.println(Arrays.toString(vector));

        return vector;
    }

    /*
    public static int[] numeros(int n1, int n2, int n3, String orden) {

        int array[] = {n1, n2, n3};
        int arrayDevuelto[] = {0, 0, 0};
        int temp;
        int i;
        int j;

        for (i = 0; i < array.length - 1; i++) {
            for (j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        if (orden.equals()) {

            arrayDevuelto = invertirVector(array);
            System.out.println("Hola");
        }
        else if(orden == "ascendente"){
            arrayDevuelto = array;
        }


        System.out.println(Arrays.toString(arrayDevuelto));

        return arrayDevuelto;
    }

    public static int[] invertirVector(int[] vector) {
        int n = vector.length;
        int[] vectorInvertido = new int[n];
        for (int i = 0; i < n; i++) {
            vectorInvertido[i] = vector[n - 1 - i];
        }
        return vectorInvertido;
    }
     */
}