package figuras;

/**
 * Clase de la figura circulo
 * @author Tatiana Salazar Parra
 *
 */
public class circulo extends figura {
	private double radio;
	
	/**
	 * Método constructor
	 * @param radio Valor ingresado por el usuario correspondiente al radio del círculo
	 */
	public circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * Método encargado de calcular el área de la figura círculo
	 * @return Área de la figura círculo
	 */
	public double area() {
		double area = 0;
		area = (Math.PI) * Math.pow(radio, 2);
		
		return area;
	}
	
	/**
	 * Método encargado de calcular el perímetro de la figura círculo
	 * @return Perímetro de la figura círculo
	 */
	public double perimetro() {
		double perimetro = 0;
		perimetro = 2 * (Math.PI) * radio;
		
		return perimetro;
	}
	
	/**
	 * Método encargado de imprimir la figura, el cálculo del área y périmetro del círculo por consola
	 */
	@Override
	public void imprimir() {
		double area = area();
		double perimetro = perimetro();
		System.out.println("Figura: Círculo\nÁrea: " + area + "\nPerímetro: " + perimetro);
	}	
}