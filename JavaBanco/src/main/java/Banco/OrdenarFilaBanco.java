
package Banco;
import java.util.Arrays;
import java.util.Random;
public class OrdenarFilaBanco {
    public static void main(String[] args) {
        // Arreglo de 25 nombres de ejemplo
        String[] nombres = {"Carlos", "Ana", "Luis", "Zoe", "Pedro", "Miguel", "Sofia", "Andrea", "Daniel", "Elena",
                "Fernando", "Laura", "Jorge", "Gabriela", "Irene", "David", "Raul", "Jose", "Pablo",
                "Sara", "Victor", "Alejandro", "Brenda", "Cristina", "Emilio"};

        // Desordenar los nombres de manera aleatoria
        Random random = new Random();
        for (int i = 0; i < nombres.length; i++) {
            int randomIndex = random.nextInt(nombres.length);
            String temp = nombres[i];
            nombres[i] = nombres[randomIndex];
            nombres[randomIndex] = temp;
        }

        // Imprimir nombres desordenados en consola
        System.out.println("Nombres desordenados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // Ordenar los nombres alfabéticamente
        Arrays.sort(nombres);

        // Imprimir los nombres ordenados en consola
        System.out.println("\nNombres ordenados alfabéticamente:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
