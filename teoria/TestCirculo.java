public class TestCirculo {
	public static void main(String[] args){

		//creamos un objeto Circulo
		Circulo c = new Circulo();
		//vamos a inicializar el valor del atributo radio
		c.setRadio(5);
		double perimetro = c.getPerimetro();
		double area      = c.getArea();
		System.out.printf("El círculo de radio %d tiene de perímetro %.2f y de área %.2f%n", c.getRadio(), perimetro, area);

	}
}
