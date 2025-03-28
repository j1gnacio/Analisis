public class SistemaAnalisisNotas {
    public static void main(String[] args) {
        // Definir el tamaño del arreglo de notas
        int cantidadNotas = 20; // Puedes cambiar este valor o hacerlo dinámico mediante argumentos de entrada

        // Generar el arreglo de notas
        double[] notas = GeneradorNotas.generarNotas(cantidadNotas);

        // Mostrar el arreglo de notas generado
        System.out.println("Arreglo de notas generadas:");
        System.out.println(Arrays.toString(notas));

        // Procesamiento de notas usando enfoque imperativo
        ProcesadorNotasImperativo.procesarNotas(notas);

        // Procesamiento de notas usando enfoque funcional
        ProcesadorNotasFuncional.procesarNotas(notas);
    }
}