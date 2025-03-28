import java.util.Arrays; // Importamos la clase Arrays para manipular el array con programación funcional

public class ProcesadorNotasFuncional {
    
    // Método que procesa un array de notas y cuenta cuántas están en ciertos rangos, usando programación funcional.
    public static void procesarNotas(double[] notas) {
        // Contamos cuántas notas son mayores a 4.0 utilizando Streams y filter()
        long mayoresA4 = Arrays.stream(notas) // Convertimos el array en un flujo de datos (stream)
                               .filter(nota -> nota > 4.0) // Filtramos solo las notas mayores a 4.0
                               .count(); // Contamos cuántos elementos cumplen la condición

        // Contamos cuántas notas son menores a 3.6
        long menoresA3_6 = Arrays.stream(notas) // Convertimos el array en un flujo de datos
                                 .filter(nota -> nota < 3.6) // Filtramos solo las notas menores a 3.6
                                 .count(); // Contamos cuántos elementos cumplen la condición

        // Contamos cuántas notas están en el rango [3.6, 4.0)
        long entre3_6y4 = Arrays.stream(notas) // Convertimos el array en un flujo de datos
                                .filter(nota -> nota >= 3.6 && nota < 4.0) // Filtramos las notas en el rango
                                .count(); // Contamos cuántos elementos cumplen la condición

        // Imprimimos los resultados del procesamiento
        System.out.println("Funcional:");
        System.out.println("Notas mayores a 4.0: " + mayoresA4);
        System.out.println("Notas menores a 3.6: " + menoresA3_6);
        System.out.println("Notas en el rango [3.6, 4.0): " + entre3_6y4);
    }
}

