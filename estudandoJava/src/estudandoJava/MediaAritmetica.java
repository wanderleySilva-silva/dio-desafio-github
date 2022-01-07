package estudandoJava;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		float[] notas = new float[4];
		
		for(int i = 0; i < notas.length;i++) {
			System.out.println("Digite a " + (i+1)+ "ª nota: ");
			
			notas[i] = entrada.nextFloat();
		}
		
		float soma = 0;
		
		int contador = 0;
		
		do{
			soma = soma + notas[contador];
			contador++;

		}while(contador < notas.length);
		
		float media = soma/notas.length;
		
		System.out.println("A média das notas é igual a " + media);

	}

}
