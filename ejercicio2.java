
 import java.util.Scanner;


 public class ejercicio2 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.print("Ingrese el tamaño de los arreglos: ");
         int tamano = scanner.nextInt();

         int[] arreglo1 = new int[tamano];
         int[] arreglo2 = new int[tamano];
         int[] arreglo3 = new int[tamano];
         int[] resultado = new int[tamano];

         System.out.println("Ingrese los elementos del primer arreglo:");
         for (int i = 0; i < tamano; i++) {
             System.out.print("Elemento " + (i + 1) + ": ");
             arreglo1[i]=scanner.nextInt();
         }

         System.out.println("Ingrese los elementos del segundo arreglo:");
         for (int i = 0; i < tamano; i++) {
             System.out.print("Elemento " + (i + 1) + ": ");
             arreglo2[i]=scanner.nextInt();
         }
         
         System.out.println("Ingrese los elementos del tercer arreglo:");
         for (int i = 0; i < tamano; i++) {
             System.out.print("Elemento " + (i + 1) + ": ");
             arreglo3[i]=scanner.nextInt();
         }


         for (int i = 0; i < tamano; i++) {
             resultado[i] = arreglo1[i] + arreglo2[i]+arreglo3[i];
         }


         System.out.println("Resultado de la suma:");
         mostrarArreglo(resultado);

         scanner.close();
     }

     public static void mostrarArreglo(int[] arreglo) {
         for (int i = 0; i < arreglo.length; i++) {
             System.out.print(arreglo[i] + " ");
         }
         System.out.println();
     }
 }
 

/*
 public class ejercicio2 {
	    public static void main(String[] args) {
	      
	        int[] arreglo1 = {1, 2, 3, 4, 5}; 
	        int[] arreglo2 = {5, 4, 3, 2, 1};
	        int tamano = arreglo1.length; 

	        int[] resultado = new int[tamano];


	        for (int i = 0; i < tamano; i++) {
	            resultado[i] = arreglo1[i] + arreglo2[i];
	        }

	        System.out.println("Contenido del primer arreglo:");
	        mostrarArreglo(arreglo1);

	        System.out.println("Contenido del segundo arreglo:");
	        mostrarArreglo(arreglo2);

	        System.out.println("Resultado de la suma:");
	        mostrarArreglo(resultado);
	    }

	    public static void mostrarArreglo(int[] arreglo) {
	        for (int i = 0; i < arreglo.length; i++) {
	            System.out.print(arreglo[i] + " ");
	        }
	        System.out.println();
	    }
	}
	
	*/

