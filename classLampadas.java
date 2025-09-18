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


package ads.coding.lista.ex025;

public class CaixaDeSom {
	
	boolean ligado;
	boolean desligado;
	int volume;
	
	
	public CaixaDeSom (boolean ligado, boolean desligado, int volume) {
		this.ligado = ligado;
		this.desligado = desligado;
		this.volume = volume;
	}
	
	
	public void mudo() {
		volume = 0;
		System.out.println("O volume do som está no 0");
	}
	
	public void estado() {
		if(ligado == true & desligado == false) {
			System.out.println("A caixa de som está ligada!");
		}else if(desligado == true & ligado == false ) {
			System.out.println("A caixa de som está desligada!");
		}
	}
	
	
	public static void main(String[] args) {
			
			CaixaDeSom caixaSom01  = new CaixaDeSom(false, true, 20);
			caixaSom01.estado();
			caixaSom01.mudo();
			//lamp1.status();
			
			
			//System.out.println("");
			//lampadas lamp2 = new lampadas("Lampada 2", false);
			
			//lamp2.status();
			
			
		}
	
	
	
}


class Computer {
    private boolean estadoMaquina;
    private String appAtivo;

    // Construtor
    public Computer(boolean estadoMaquina, String appAtivo) {
        this.estadoMaquina = estadoMaquina;
        this.appAtivo = appAtivo;
    }

    // Métodos
    public void app() {
        System.out.println("Abrindo " + this.appAtivo);
    }

    public void status() {
        if (this.estadoMaquina == true) {
            System.out.println("O computador está ligado");
        } else {
            System.out.println("O computador está desligado.");
        }
    }

    public void reiniciando() {
        System.out.println("Reiniciando o sistema...");
    }
}

public class Main {
    public static void main(String[] args) {
        Computer computer00 = new Computer(false, "Notion");
        computer00.status();

        Computer computer01 = new Computer(true, "Notion");
        computer01.status();
        computer01.app();
        computer01.reiniciando();
    }
}


