package Ejercicios;
import static Ejercicios.Keyboard1.*;
public class Prueba {

	public static void main(String[] args) {

		/*
		 * Realizar las siguientes comprobaciones utilizando matches
		 */
		String s;
		char letter = 'a'; 
		
		//con este bucle se irÃ¡n mostrando cada letra de la a y la k con lo que se pide hacer
		do {
			System.out.print(letter + ") ");
			s = lecturaString();
			
			System.out.println(matches(s, letter));
			//cada vez que se hace un caso, se incrementa la letra
			letter++;
			
		} while (letter <= 'k');
		
		
		closeKeyboard();
	}
	
	public static boolean matches(String s, char letter) {
		boolean result = false;
		
		switch (letter) {
			//a) que la cadena sea exactamente â€œTrueâ€�
			case 'a':
				result = s.matches("True||true");
				break;
			//b) que la cadena sea de tres letras, mayÃºsculas o minÃºsculas
			case 'b':
				result = s.matches("[aA-Zz]{3}");
				break;
			//c) que la cadena contenga 5 o mÃ¡s caracteres que no sean la Ã±, la z ni la x.
			case 'c':
				result = s.matches("[^Ã±zxÃ‘ZX]{5,}");
				break;
			//d) que la cadena no empiece con un nÃºmero
			case 'd':
				result = s.matches("\\D.*");
				break;
			//e) que la cadena tenga varios caracteres excepto la b.
			case 'e':
				result = s.matches("[aA-Zz[^bB]]{2,}");
				break;
			//f) que la cadena tenga un nÃºmero positivo mÃ¡s pequeÃ±o que 300.
			case 'f': 
				result = s.matches("[0-2]?[0-9]?[0-9]");
				break;
			//g) que la cadena sea un nÃºmero de telÃ©fono
			case 'g':
				result = s.matches("[0-9]{9}");
				break;
			//h) que la cadena sea un DNI
			case 'h':
				result = s.matches("[0-9]{8}[A-Z[^IÃ‘OU]]");
				break;
			//i) que la cadena sea un nombre, es decir, que no tenga espacios, que no sea una cadena vacÃ­a y que empiece por mayÃºsculas
			case 'i':
				result = s.matches("[A-ZÃ�Ã‰Ã�Ã“ÃšÃ‘][a-zÃ¡Ã©Ã­Ã³ÃºÃ±]+");
				break;
			//j) que la cadena empiece con vocal y luego tenga varias consonantes o ninguna.
			case 'j': 
				result = s.matches("[aeiouÃ¡Ã©Ã­Ã³ÃºAEIOUÃ�Ã‰Ã�Ã“Ãš][b-zÃ±B-ZÃ‘&&[^eiouÃ©Ã­Ã³ÃºEIOUÃ‰Ã�Ã“Ãš]]*");
				break;
			//k) que la cadena sea un correo electrÃ³nico acabado en .com o en .es
			case 'k':
				result = s.matches("[a-zA-Z0-9]@[a-z][\\.](.com||.es)");
				break;
			}
			
			//devuelve el resultado
			return result;
		}

	}
