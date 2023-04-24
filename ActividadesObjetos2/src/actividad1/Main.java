package actividad1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Creamos un objeto de la clase Hora con la hora actual
        Hora horaActual = new Hora();

        // Mostramos la hora actual
        System.out.println("Hora actual: " + horaActual.getHora() + ":" + horaActual.getMinuto() + ":" + horaActual.getSegundo());

        // Pedimos al usuario que introduzca la cantidad de segundos a incrementar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la cantidad de segundos a incrementar: ");
        int segundos = scanner.nextInt();

        // Incrementamos los segundos de la hora actual
        horaActual.incrementaSegundo(segundos);

        // Mostramos la nueva hora con los segundos incrementados
        System.out.println("Nueva hora: " + horaActual.getHora() + ":" + horaActual.getMinuto() + ":" + horaActual.getSegundo());

        // Cerramos el scanner
        scanner.close();
    }
}


