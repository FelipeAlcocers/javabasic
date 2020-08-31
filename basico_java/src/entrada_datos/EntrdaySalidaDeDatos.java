package entrada_datos;

import java.util.Scanner;

public class EntrdaySalidaDeDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mensaje = "Lo estas haciendo bien";
		System.out.println("mensaje:" + mensaje);
		System.out.println("mensaje: " + mensaje);
		
		Scanner teclado = new Scanner(System.in);
		String cadena;
		int numero = 0;
		double numeroreal = 0.2;
		
		System.out.println("Introduce una cadena de texto: ");
		cadena = teclado.nextLine();
		System.out.println("Introduce un numero entero: ");
		numero = teclado.nextInt();
		System.out.println("Introduce un numero real: ");
		numeroreal = teclado.nextDouble();
		
		System.out.println("La cadena que infresaste es: " + cadena);
		System.out.println("El numero entero es:" + numero);
		System.out.println("El numero Decimal es:" + numeroreal);
		
		//Diferencias entre print, println, printf
		String mensajes = "Este es un mensaje";
		System.out.println(mensajes);
		System.out.print(mensajes);
	
		//Pritnf
		double pago = 45.567890;
		System.out.printf("%4.2f", pago);
		System.out.println();
		System.out.printf("Cadena:%s,Entero: %d, Real: %4.2f", "Hola", 245, 78.45); 
		
	
		

	}

}
