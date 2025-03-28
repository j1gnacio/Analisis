import java.util.Random;

public class GeneradorNotas {
    // Método para generar un array de notas aleatorias
    public static double[] generarNotas(int cantidad) {
        Random random = new Random(); // Creamos una instancia de Random para generar números aleatorios
        double[] notas = new double[cantidad]; // Creamos un array para almacenar las notas
        
        // Iteramos sobre el array para llenarlo con notas aleatorias
        for (int i = 0; i < cantidad; i++) {
            notas[i] = 1.0 + (6.0 * random.nextDouble()); // Generamos una nota aleatoria entre 1.0 y 7.0
        }
        
        return notas; // Devolvemos el array de notas generado
    }
}
