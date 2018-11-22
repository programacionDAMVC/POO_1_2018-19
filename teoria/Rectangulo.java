public class Rectangulo {

	private int base;
	private int altura;

	public int getBase(){
		return base;
	}
	public int getAltura(){
		return altura;
	}
	public void setBase(int base){
		this.base = base;
	}
	public void setAltura(int altura){
		this.altura = altura;
	}

	public int getPerimetro(){
		return 2 * base + 2 * altura;
	}
	public int getArea() {
		return base * altura;
	}


}
