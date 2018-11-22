/**Clase Rectangulo que 
 * nos sirve para crear objetos que
 * manipulan figuara geométricas de
 * tipo rectángulo
 * @author Manuel M.
 * @version 1.0
 */
public class Rectangulo {

	private int base;
	private int altura;

	/**getter para el atributo base
	 * @return el valor de la base del 
	 * rectángulo
	 */
	public int getBase(){
		return base;
	}
	/**getter para el atributo altura
         * @return el valor de la altura del
         * rectángulo
         */
	public int getAltura(){
		return altura;
	}
	/**setter para inicializar o modificar el
	 * valor de la base del rectángulo
	 * @param base  - es la base del rectángulo
	 */
	public void setBase(int base){
		this.base = base;
	}/**setter para inicializar o modificar el
         * valor de la altura del rectángulo
         * @param altura  - es la altura del rectángulo
         */
	public void setAltura(int altura){
		this.altura = altura;
	}
	/**método que calcula el perímetro
	 * del rectángulo de acuerdo a su fórmula
	 * matemática
	 * @return el valor del perímetro del rectángulo
	 */
	public int getPerimetro(){
		return 2 * base + 2 * altura;
	}
	/**método que calcula el área
         * del rectángulo de acuerdo a su fórmula
         * matemática
         * @return el valor de la superficie del rectángulo
         */
	public int getArea() {
		return base * altura;
	}


}
