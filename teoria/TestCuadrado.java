public class TestCuadrado{
	public static void main(String... args){

		Cuadrado c1 = new Cuadrado(5);
		System.out.printf("Cuadrado de lado %d%n", c1.getLado());
		c1.setLado(15);
		System.out.printf("Cuadrado de lado %d%n", c1.getLado());

		//Cuadrado c2 = new Cuadrado(); no puede acceder al constructor
		//por defecto porque la clase Cuadrado ya tienes Constructor/res

	}
}
