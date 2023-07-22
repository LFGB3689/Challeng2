package mx.Conversor.Modelo;

public class Moneda {
	private static float peso;
	private static float otro;
	private static float conversor;
	
	public Moneda (float peso, float otro, float conversor){
		if(peso != 0) {
			Moneda.peso = peso;
			Moneda.conversor = conversor;
			Moneda.otro = peso/conversor;
		}
		else if(otro != 0) {
			Moneda.otro = otro;
			Moneda.conversor = conversor;
			Moneda.peso = otro*conversor;
		}
	}
	
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		Moneda.peso = peso;
		Moneda.otro = peso/Moneda.conversor;
	}
	public float getOtro() {
		return otro;
	}
	public void setOtro(float otro) {
		Moneda.otro = otro;
		Moneda.peso = otro*Moneda.conversor;
	}
	public float getConversor() {
		return conversor;
	}
	public void setConversor(float conversor) {
		Moneda.conversor = conversor;
	}
	
	
}
