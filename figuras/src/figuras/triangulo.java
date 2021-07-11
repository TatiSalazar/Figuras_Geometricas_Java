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
	 * Método constructor
	 * @param lado1 Valor ingresado por el usuario correspondiente al lado 1 del triángulo
	 * @param lado2 Valor ingresado por el usuario correspondiente al lado 2 del triángulo
	 * @param lado3 Valor ingresado por el usuario correspondiente al lado 3 del triángulo
	 */
	public triangulo(double lado1, double lado2, double lado3) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
	}
	
	/**
	 * Método encargado de calcular el área de la figura triángulo
	 * @return Área de la figura triángulo
	 */
	public double area() {
		double area = 0;
		area = (lado1 * lado2) / 2;
		
		return area;
	}
	
	/**
	 * Método encargado de calcular el perímetro de la figura triángulo
	 * @return Perímetro de la figura triángulo
	 */
	public double perimetro() {
		double perimetro = 0;
		perimetro = lado1 + lado2 + lado3;
		
		return perimetro;
	}
	
	/**
	 * Método encargado de imprimir la figura, el cálculo del área y périmetro del triángulo por consola
	 */
	@Override
	public void imprimir() {
		double area = area();
		double perimetro = perimetro();
		System.out.println("Figura: Triángulo\nÁrea: " + area + "\nPerímetro: " + perimetro);
	}
}
