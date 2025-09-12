package lampadas;

public class lampadas {

	boolean ligada = false;
	String nome;
	
	public lampadas(String nome) {
		this.nome = nome;
	}
	
	// segundo constructor
	public lampadas(String nome, boolean ligada) {
		this.nome = nome;
		this.ligada = ligada;
		
	}
	
	public void ligar() {
		ligada = true;
	}
	
	public void desligar() {
		ligada = false;
	}
	
	public void status() {
		if(ligada == true)
			System.out.println("Nome da Lâmpada: " + nome + " Estado: Ligada" );
		else
			System.out.println("Nome da Lâmpada: " + nome + " Estado: Desligada");
	}
	
	public static void main(String[] args) {
		
		lampadas lamp1  = new lampadas("Lampada 1", false);
		lamp1.status();
		
		
		System.out.println("");
		lampadas lamp2 = new lampadas("Lampada 2", false);
		
		lamp2.status();
		
		
	}
	
	
}
