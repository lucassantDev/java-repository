package ads.coding.lista.ex027;

public class Termostato {
	float temperatura;
	
	public Termostato(float temperatura) {
		this.temperatura = temperatura;
	}
	
	public void Temperatura() {
		if(temperatura >= 15 & temperatura < 20) {
			System.out.println( temperatura + "°" + ": Clima frio");
		}
			else if(temperatura >=20  & temperatura <= 25) {
			System.out.println(temperatura + "°" + ": Clima normal");
		}
			else if(temperatura > 25  & temperatura <= 30) {
			System.out.println(temperatura + "°" + ": Clima quente");
		}
			else if(temperatura > 30  & temperatura >= 35) {
				System.out.println( temperatura + "°" + ": Clima muito quente");
			}
	}
	
	public static void main(String[] args) {
		
		Termostato temp00 = new Termostato(39);
		temp00.Temperatura();
		
		Termostato temp01 = new Termostato(18);
		temp01.Temperatura();
		
		Termostato temp02 = new Termostato(25);
		temp02.Temperatura();
		
		Termostato temp03 = new Termostato(28);
		temp03.Temperatura();
	}
}
