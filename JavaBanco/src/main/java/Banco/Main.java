
package Banco;
public class Main {
    public static void main(String[] args) {
        // Arreglo
        String[] nombres = {
                "Carlos", "Ana", "Luis", "Zoe", "Pedro",
                "Miguel", "Sofia", "Andrea", "Daniel", "Elena",
                "Fernando", "Laura", "Jorge", "Gabriela",
                "Irene", "David", "Raul", "Jose", "Pablo",
                "Sara", "Victor", "Alejandro", "Brenda",
                "Cristina", "Emilio"
        };

        // Imprimir nombres desordenados en consola
        System.out.println("Nombres desordenados:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }

        // MetoDO Ordenas
        String[] nombresOrdenados = OrdenarFilaBanco.ordenarNombres(nombres);

        // Imprimir los nombres ordenados
        System.out.println("\nNombres ordenados alfabéticamente:");
        for (String nombre : nombresOrdenados) {
            System.out.println(nombre);
        }
    }
}
