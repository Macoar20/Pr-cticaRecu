package actividad2;

public class Main {
    
	public static void main(String[] args) {
        // Creamos un contador con valor inicial 5
        Contador contador1 = new Contador(5);
        System.out.println("Contador1: " + contador1.getCont()); // Output: 5
        
        // Incrementamos el contador
        contador1.incrementar();
        System.out.println("Contador1 incrementado: " + contador1.getCont()); // Output: 6
        
        // Decrementamos el contador
        contador1.decrementar();
        System.out.println("Contador1 decrementado: " + contador1.getCont()); // Output: 5
        
        // Intentamos decrementar el contador hasta un valor negativo
        contador1.decrementar();
        contador1.decrementar();
        contador1.decrementar();
        System.out.println("Contador1 decrementado tres veces: " + contador1.getCont()); // Output: 2
        
    }
}

