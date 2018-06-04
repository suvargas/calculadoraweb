package co.edu.ejemplo.calculadora;

public class CalculadoraLogic {

	public static Integer sumar(Integer n1, Integer n2) throws Exception{
		
		Integer resultado = 0;
		
		try {
			
			if(n1 == null) {
				throw new Exception("Se debe ingresar el primer número");
			}
			
			if(n2 == null) {
				throw new Exception("Se debe ingresar el segundo número");
			}
			
			resultado = n1 + n2;
			
			return resultado;
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;
		}
		
		
	}
	
	public static Integer restar(Integer n1, Integer n2) throws Exception{
		
		Integer resultado = 0;
		
		try {
			
			if(n1 == null) {
				throw new Exception("Se debe ingresar el primer número");
			}
			
			if(n2 == null) {
				throw new Exception("Se debe ingresar el segundo número");
			}
			
			resultado = n1 - n2;
			
			return resultado;
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;
		}		
		
	}
	
	public static Integer multiplicar(Integer n1, Integer n2) throws Exception{
		
		Integer resultado = 0;
		
		try {
			
			if(n1 == null) {
				throw new Exception("Se debe ingresar el primer número");
			}
			
			if(n2 == null) {
				throw new Exception("Se debe ingresar el segundo número");
			}
			
			resultado = n1 * n2;
			
			return resultado;
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;
		}
		
		
	}
	
	public static Integer dividir(Integer n1, Integer n2) throws Exception{
		
		Integer resultado = 0;
		
		try {
			
			if(n1 == null) {
				throw new Exception("Se debe ingresar el primer número");
			}
			
			if(n2 == null) {
				throw new Exception("Se debe ingresar el segundo número");
			}
			
			if(n2 == 0) {
				throw new Exception("No se puede realizar divisiones por cero");
			}
			
			resultado = n1 / n2;
			
			return resultado;
		} catch (Exception e) {
			System.out.println(e.getMessage());	
			return null;
		}
		
		
	}
	
	
}
