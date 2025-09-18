package ads.coding.lista.ex025;

public class CaixaDeSom {
	
	boolean estadoCaixa;
	int volume;
	
	
	public CaixaDeSom (boolean estadoCaixa, int volume) {
		this.estadoCaixa = estadoCaixa;
		this.volume = volume;
	}
	
	
	public void mudo() {
		volume = 0;
		System.out.println("O volume do som está no 0");
	}
	
	public void volumeSom() {
		if(volume > 0) {
			System.out.println("O som está no volume " + volume);
		}
		
		else {
			mudo();
		}
	}
	
	public void estado() {
		if(estadoCaixa == true) {
			System.out.println("A caixa de som está ligada!");
		}else if(estadoCaixa == true) {
			System.out.println("A caixa de som está desligada!");
		}
	}
	
	
	public static void main(String[] args) {
			
			CaixaDeSom caixaSom01  = new CaixaDeSom(true, 0);
			caixaSom01.estado();
			caixaSom01.volumeSom();
			
			
		}
	
	
	
}