package actividad1;

public class Hora {

	int hora;
	int minuto;
	int segundo;
	
	
	public Hora() {
	
	}


	public Hora(int hora, int minuto, int segundo) {
		
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}
	
	
	
	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}


	public int getSegundo() {
		return segundo;
	}


	public void setSegundo(int segundo) {
		this.segundo = segundo;
	}


	void incrementaSegundo (int aumento) {
		
		segundo += aumento;
		while (segundo>=60) {
		
			if (segundo == 60) {
				
				segundo = 0;
				minuto += 1;
			}	else if (segundo > 60) {
				segundo = segundo-60;
				minuto += 1;
			}	
					
			if (minuto >= 60) {
				minuto = minuto-60;
				hora += 1;
				
			}
			
			if (hora == 24) {
				hora = 0;
				
			}
			
		}
		
	}
	
	
}
