package figuras;

/**
 * Clase de la figura cuadrado
 * @author Tatiana Salazar Parra
 *
 */
public class cuadrado extends figura {
	private double ancho;
	
	/**
	 * M�todo constructor
	 * @param ancho Valor ingresado por el usuario correspondiente al ancho del cuadrado
	 */
	public cuadrado(double ancho) {
		super();
		this.ancho = ancho;
	}
	
	/**
	 * M�todo encargado de calcular el �rea de la figura cuadrado
	 * @return �rea de la figura cuadrado
	 */
	public double area() {
		double area = 0;
		area = ancho * ancho;
		
		return area;
	}
	
	/**
	 * M�todo encargado de calcular el per�metro de la figura cuadrado
	 * @return Per�metro de la figura cuadrado
	 */
	public double perimetro() {
		double perimetro = 0;
		perimetro = ancho + ancho + ancho + ancho;
		
		return perimetro;
	}
	
	/**
	 * M�todo encargado de imprimir la figura, el c�lculo del �rea y p�rimetro del cuadrado por consola
	 */
	@Override
	public void imprimir() {
		double area = area();
		double perimetro = perimetro();
		System.out.println("Figura: Cuadrado\n�rea: " + area + "\nPer�metro: " + perimetro);
	}
}
