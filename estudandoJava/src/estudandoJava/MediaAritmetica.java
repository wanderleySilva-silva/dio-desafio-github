package estudandoJava;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de notas do estudante: ");
		int quantidadeDeNotas = entrada.nextInt();
		
		float[] notas = new float[quantidadeDeNotas];
		
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
		
		if(media >= 7) {
			System.out.println("M�dia igual a " + media + ". Aluno aprovado.");
		}else {
			System.out.println("M�dia igual a " + media + ". Aluno reprovado.");
		}
	}

}
