package test;


import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;
import org.junit.jupiter.api.Test;

import figuras.circulo;
import figuras.cuadrado;
import figuras.triangulo;

class figurasTest {

	@Test
	public void circuloAreaTest() {
		DecimalFormat formato = new DecimalFormat("#.########");
		circulo c = new circulo(5);
		double area = c.area();
		double esperado = 78.53981634;
		System.out.println("Área Círculo:\n" + formato.format(area) + "\n" + formato.format(esperado));
		assertEquals(formato.format(esperado), formato.format(area));
	}
	
	
	@Test
	public void circuloPerimetroTest() {
		DecimalFormat formato = new DecimalFormat("#.########");
		circulo c = new circulo(5);
		double perimetro = c.perimetro();
		double esperado = 31.41592654;
		System.out.println("Perímetro Círculo:\n" + formato.format(perimetro) + "\n" + formato.format(esperado));
		assertEquals(formato.format(esperado), formato.format(perimetro));
	}

	@Test
	public void trianguloAreaTest() {
		triangulo t = new triangulo(2, 5, 3);
		double area = t.area();
		double esperado = 5;
		System.out.println("Área Triángulo:\n" + area + "\n" + esperado);
		assertEquals(esperado, area);
	}
	
	@Test
	public void trianguloPerimetroTest() {
		triangulo t = new triangulo(2, 5, 3);
		double area = t.perimetro();
		double esperado = 10;
		System.out.println("Perímetro Triángulo:\n" + area + "\n" + esperado);
		assertEquals(esperado, area);
	}
	
	@Test
	public void cuadradoAreaTest() {
		cuadrado c = new cuadrado(7);
		double area = c.area();
		double esperado = 49;
		System.out.println("Área Cuadrado:\n" + area + "\n" + esperado);
		assertEquals(esperado, area);
	}
	
	@Test
	public void cuadradoPerimetroTest() {
		cuadrado c = new cuadrado(7);
		double area = c.perimetro();
		double esperado = 28;
		System.out.println("Perímetro Cuadrado:\n" + area + "\n" + esperado);
		assertEquals(esperado, area);
	}
}
