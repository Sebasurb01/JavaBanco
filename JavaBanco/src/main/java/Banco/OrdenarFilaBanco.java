
package Banco;
import java.util.Arrays;
import java.util.Random;

public class OrdenarFilaBanco {

    // Método para desordenar y ordenar nombres
    public static String[] ordenarNombres(String[] nombres) {
        //nombres de manera aleatoria
        Random random = new Random();
        for (int i = 0; i < nombres.length; i++) {
            int randomIndex = random.nextInt(nombres.length);
            String temp = nombres[i];
            nombres[i] = nombres[randomIndex];
            nombres[randomIndex] = temp;
        }

        // Ordenar los nombres alfabéticamente
        Arrays.sort(nombres);
        return nombres;
    }
}
