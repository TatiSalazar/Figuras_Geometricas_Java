package figuras;

/**
 * Clase de la figura circulo
 * @author Tatiana Salazar Parra
 *
 */
public class circulo extends figura {
	private double radio;
	
	/**
	 * M�todo constructor
	 * @param radio Valor ingresado por el usuario correspondiente al radio del c�rculo
	 */
	public circulo(double radio) {
		super();
		this.radio = radio;
	}
	
	/**
	 * M�todo encargado de calcular el �rea de la figura c�rculo
	 * @return �rea de la figura c�rculo
	 */
	public double area() {
		double area = 0;
		area = (Math.PI) * Math.pow(radio, 2);
		
		return area;
	}
	
	/**
	 * M�todo encargado de calcular el per�metro de la figura c�rculo
	 * @return Per�metro de la figura c�rculo
	 */
	public double perimetro() {
		double perimetro = 0;
		perimetro = 2 * (Math.PI) * radio;
		
		return perimetro;
	}
	
	/**
	 * M�todo encargado de imprimir la figura, el c�lculo del �rea y p�rimetro del c�rculo por consola
	 */
	@Override
	public void imprimir() {
		double area = area();
		double perimetro = perimetro();
		System.out.println("Figura: C�rculo\n�rea: " + area + "\nPer�metro: " + perimetro);
	}	
}