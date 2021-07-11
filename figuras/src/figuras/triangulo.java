package figuras;

/**
 * Clase de la figura triangulo
 * @author Tatiana Salazar Parra
 *
 */
public class triangulo extends figura {
	private double lado1;
	private double lado2;
	private double lado3;
	
	/**
	 * M�todo constructor
	 * @param lado1 Valor ingresado por el usuario correspondiente al lado 1 del tri�ngulo
	 * @param lado2 Valor ingresado por el usuario correspondiente al lado 2 del tri�ngulo
	 * @param lado3 Valor ingresado por el usuario correspondiente al lado 3 del tri�ngulo
	 */
	public triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	/**
	 * M�todo encargado de calcular el �rea de la figura tri�ngulo
	 * @return �rea de la figura tri�ngulo
	 */
	public double area() {
		double area = 0;
		area = (lado1 * lado2) / 2;
		
		return area;
	}
	
	/**
	 * M�todo encargado de calcular el per�metro de la figura tri�ngulo
	 * @return Per�metro de la figura tri�ngulo
	 */
	public double perimetro() {
		double perimetro = 0;
		perimetro = lado1 + lado2 + lado3;
		
		return perimetro;
	}
	
	/**
	 * M�todo encargado de imprimir la figura, el c�lculo del �rea y p�rimetro del tri�ngulo por consola
	 */
	@Override
	public void imprimir() {
		double area = area();
		double perimetro = perimetro();
		System.out.println("Figura: Tri�ngulo\n�rea: " + area + "\nPer�metro: " + perimetro);
	}
}
