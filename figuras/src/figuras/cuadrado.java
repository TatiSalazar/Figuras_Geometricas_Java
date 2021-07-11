package figuras;

/**
 * Clase de la figura cuadrado
 * @author Tatiana Salazar Parra
 *
 */
public class cuadrado extends figura {
	private double ancho;
	
	/**
	 * Método constructor
	 * @param ancho Valor ingresado por el usuario correspondiente al ancho del cuadrado
	 */
	public cuadrado(double ancho) {
		super();
		this.ancho = ancho;
	}
	
	/**
	 * Método encargado de calcular el área de la figura cuadrado
	 * @return Área de la figura cuadrado
	 */
	public double area() {
		double area = 0;
		area = ancho * ancho;
		
		return area;
	}
	
	/**
	 * Método encargado de calcular el perímetro de la figura cuadrado
	 * @return Perímetro de la figura cuadrado
	 */
	public double perimetro() {
		double perimetro = 0;
		perimetro = ancho + ancho + ancho + ancho;
		
		return perimetro;
	}
	
	/**
	 * Método encargado de imprimir la figura, el cálculo del área y périmetro del cuadrado por consola
	 */
	@Override
	public void imprimir() {
		double area = area();
		double perimetro = perimetro();
		System.out.println("Figura: Cuadrado\nÁrea: " + area + "\nPerímetro: " + perimetro);
	}
}
