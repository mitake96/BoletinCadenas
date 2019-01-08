package Ejercicios;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 // ejemplo creacion array
		
		int precios[]=new int[7]; // Se crea el array de tipo int "precios" y se le da el valor de 7 datos en memoria
		precios[0] = 7; // Se le da un valor al precio "0"
		
		int notas[] = new int [];
		int suma=0, media=0;
		for (int i=0;i<=17;i++){
		suma+=notas[i];
		}
		media=suma/18;
		
		
		
		
		
		System.out.println(media);
	}

}