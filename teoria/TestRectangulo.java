public class TestRectangulo {
	public static void main(String[] args){
		
		Rectangulo r1 = new Rectangulo();
		r1.setBase(15);
		r1.setAltura(100);
		System.out.printf("Rectángulo de base %d, altura %d de perímetro %d y superficie %d%n", r1.getBase(), r1.getAltura(), r1.getPerimetro(), r1.getArea());
		Rectangulo r2 = new Rectangulo();
		r2.setBase(12);
		r2.setAltura(10);
		System.out.printf("Rectángulo de base %d, altura %d de perímetro %d y superficie %d%n", r2.getBase(), r2.getAltura(), r2.getPerimetro(), r2.getArea());

	}
}
