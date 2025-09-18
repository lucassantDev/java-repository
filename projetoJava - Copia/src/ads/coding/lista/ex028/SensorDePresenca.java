package ads.coding.lista.ex028;

public class SensorDePresenca {
	boolean estadoSensor;
	float calorDetectado;
	
	public SensorDePresenca(boolean estadoSensor, float calorDetectado) {
		this.estadoSensor = estadoSensor;
		this.calorDetectado = calorDetectado;
	}
	
	public SensorDePresenca(boolean estadoSensor) {
		this.estadoSensor = estadoSensor;
		
	}
	
	
	public void status() {
		if(estadoSensor == true) {
			System.out.println("Sensor Ativado!");
		}
		else if(estadoSensor == false) {
			System.out.println("Sensor Desativado!");
		}
	}
	
	
	/*inspirado em sensores infravermelho*/
	
	public void Detectar() {
		if (calorDetectado < 35) {
			System.out.println("Nada detectado.");
		}
		
		else{
			System.out.println("Algo Detectado!!!!");
		}
	}
	
	public static void main(String[] args) {
		System.out.println();
		
		SensorDePresenca primeiroSensor = new SensorDePresenca(false);
		primeiroSensor.status();
		
		System.out.println();
		
		SensorDePresenca segundoSensor = new SensorDePresenca(true, 39);
		segundoSensor.status();
		segundoSensor.Detectar();
		
		System.out.println();
		
		SensorDePresenca terceiroSensor = new SensorDePresenca(true, 22);
		terceiroSensor.status();
		terceiroSensor.Detectar();
		
	}
	
}
