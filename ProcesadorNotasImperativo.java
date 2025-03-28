public class ProcesadorNotasImperativo {
    
    // Método que procesa un array de notas y cuenta cuántas están en ciertos rangos.
    public static void procesarNotas(double[] notas) {
        // Contadores para cada categoría de notas
        int mayoresA4 = 0;       // Contará las notas mayores a 4.0
        int menoresA3_6 = 0;     // Contará las notas menores a 3.6
        int entre3_6y4 = 0;      // Contará las notas en el rango [3.6, 4.0)

        // Iteramos sobre cada nota en el array
        for (double nota : notas) {
            if (nota > 4.0) {
                mayoresA4++; // Incrementamos el contador de notas mayores a 4.0
            } else if (nota < 3.6) {
                menoresA3_6++; // Incrementamos el contador de notas menores a 3.6
            } else if (nota >= 3.6 && nota < 4.0) {
                entre3_6y4++; // Incrementamos el contador de notas en el rango [3.6, 4.0)
            }
        }

        // Imprimimos los resultados del procesamiento
        System.out.println("Imperativo:"); 
        System.out.println("Notas mayores a 4.0: " + mayoresA4);
        System.out.println("Notas menores a 3.6: " + menoresA3_6);
        System.out.println("Notas en el rango [3.6, 4.0): " + entre3_6y4);
    }
}
