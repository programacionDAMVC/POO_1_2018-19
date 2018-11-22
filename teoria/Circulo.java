public class Circulo {
	
	//atributos
	private int radio;

	//métodos
	public int getRadio() {
		return radio;	
	}
	public void setRadio(int radio) {
		this.radio = radio;
	}
	public double getPerimetro(){

		double perimetro = 2 * Math.PI * radio;
		return perimetro;

	}
	public double getArea() {
		return Math.PI * radio * radio;	
	}


}
