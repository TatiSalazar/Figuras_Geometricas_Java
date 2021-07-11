package figuras;

import java.util.Scanner;

/**
 * Clase principal, Main
 * @author Tatiana Salazar Parra
 *
 */
public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean salir = false;
		String radio, lado1, lado2, lado3, ancho;
		figura f = null;
		impresoraFiguras imf = new impresoraFiguras();
		
		while (!salir) {
			System.out.println("1. Circulo");
	        System.out.println("2. Triangulo");
	        System.out.println("3. Cuadrado");
	        System.out.println("4. Salir");

	        System.out.println("\nEscribe una de las opciones:");
	        opcion = sc.nextInt();
	        if(validarOpcion(opcion) == true) {
	        	switch (opcion) {
	        	case 1:
	        		System.out.println("Ingrese el radio del círculo:");
	        		radio = sc.next();
	        		if(validarNumero(radio) == true) {
	        			f = new circulo(Double.parseDouble(radio));
	        			imf.impresoraFiguras(f);	        			
	        		} else {
	        			System.out.println("Por favor, recuerde que se debe ingresar un número y que sea positivo\n");
	        		}
	        		break;
	        	case 2:
	        		System.out.println("Ingrese los tres lados del triángulo:");
	        		lado1 = sc.next();
	        		lado2 = sc.next();
	        		lado3 = sc.next();
	        		if(validarNumero(lado1) == true && validarNumero(lado2) == true && validarNumero(lado3) == true) {
	        			f = new triangulo(Double.parseDouble(lado1), Double.parseDouble(lado2), Double.parseDouble(lado3));
	        			imf.impresoraFiguras(f);	        			
	        		} else {
	        			System.out.println("Por favor, recuerde que se debe ingresar un número y que sea positivo\n");
	        		}
	        		break;
	        	case 3:
	        		System.out.println("Ingrese el ancho del cuadrado:");
	        		ancho = sc.next();
	        		if(validarNumero(ancho) == true) {
	        			f = new cuadrado(Double.parseDouble(ancho));
	        			imf.impresoraFiguras(f);	        			
	        		} else {
	        			System.out.println("Por favor, recuerde que se debe ingresar un número y que sea positivo\n");
	        		}
	        		break;
	        	case 4:
	        		salir = true;
	        		break;
	        	default:
	        		break;
	        	}	        	
	        } else {
	        	System.out.println("Por favor, recuerde que se debe ingresar una de las opciones 1, 2, 3 o 4\n");
	        }
		}
	}
	
	/**
	 * Método para validar que la opción ingresada por el usuario corresponde a las mostradas en pantalla
	 * @param opcion Número ingresado por el usuario
	 * @return boolean
	 */
	public static boolean validarOpcion(int opcion) {
		boolean numeroErroneo;
		
		if(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4) {
			numeroErroneo = true;
		} else {
			numeroErroneo = false;
		}
		
		return numeroErroneo;		
	}
	
	/**
	 * Método para validar que el usuario ha ingresado un número
	 * @param numero Ingresado por el usuario
	 * @return boolean
	 */
	public static boolean validarNumero(String numero) {
		boolean num;
		
		if(numero.contentEquals("0")) {
			num = false;
		}
		else if(numero.chars().allMatch(Character::isDigit) == true) {
			num = true;
		} else {
			num = false;
		}
		
		return num;
	}
}
