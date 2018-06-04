package co.edu.ejemplo.calculadora.test;

import static org.junit.Assert.*;

import org.junit.Test;

import co.edu.ejemplo.calculadora.CalculadoraLogic;

public class CalculadoraTest {

	public static final Integer NUMERO_1 = 10;
	public static final Integer NUMERO_2 = 5;
	
	
	@Test
	public void sumar() {

		try {
			Integer resultado = CalculadoraLogic.sumar(NUMERO_1, NUMERO_2);
			System.out.println("La suma es: "+ resultado);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void restar() {
		try {
			Integer resultado = CalculadoraLogic.restar(NUMERO_1, NUMERO_2);
			System.out.println("La resta es: "+ resultado);

		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	
	@Test
	public void multiplicar() {
		try {
			Integer resultado = CalculadoraLogic.multiplicar(NUMERO_1, NUMERO_2);
			System.out.println("La multiplicación es: "+ resultado);

		} catch (Exception e) {
			e.printStackTrace();
		}	}
	
	@Test
	public void dividir() {
		try {
			Integer resultado = CalculadoraLogic.dividir(NUMERO_1, NUMERO_2);
			System.out.println("La división es: "+ resultado);
			
		} catch (Exception e) {
			e.printStackTrace();
		}	}

}
