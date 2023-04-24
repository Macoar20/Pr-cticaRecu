package actividad2;

public class Contador {
	
	private int cont;

	public Contador() {
		
	}

	public Contador(int cont) {
		
		this.cont = cont;
		if (cont < 0) {
			this.cont=0;
		}
	}
	
	
	
	public int getCont() {
		return cont;
	}

	public void setCont(int cont) {
		this.cont = cont;
	}

	void incrementar() {
		
		cont ++;

	}
	
	int decrementar() {
		
		cont -= 1;
		if (cont < 0) {
			cont = 0;
		}
		return cont;
		
	}	

   
}

