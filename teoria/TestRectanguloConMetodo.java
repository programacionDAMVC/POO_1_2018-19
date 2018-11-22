public class TestRectanguloConMetodo {

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();
		r1.setBase(8);
		r1.setAltura(12);
		imprimirRectangulo(r1);
		Rectangulo r2 = new Rectangulo();
		r2.setBase(6);
		r2.setAltura(11);
		imprimirRectangulo(r2);
		Rectangulo r3 = new Rectangulo();
		r3.setBase(4);
		r3.setAltura(10);
		imprimirRectangulo(r3);

	}

	public static void imprimirRectangulo(Rectangulo r) {

		System.out.printf("Rectángulo de base %d, altura %d de perímetro %d y superficie %d%n", r.getBase(), r.getAltura(), r.getPerimetro(), r.getArea());

	}
}
