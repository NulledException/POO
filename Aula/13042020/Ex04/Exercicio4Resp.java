
import java.util.Scanner;

public class Exercicio4Resp {

    public static void main(String[] args) {

	Scanner in = new Scanner(System.in);
	int numero, contador, resposta;
	int[] vetor = new int[1000];
	
	
	contador = 0;
	System.out.println("Deseja informar um número para o vetor (1-Sim, 0-Não)?");
	resposta = in.nextInt();
	while(resposta==1 && contador < 1000) {
	    System.out.println("Informe um número para a posição " + contador + " do vetor:");
	    numero = in.nextInt();
	    vetor[contador++] = numero;
	    System.out.println("Deseja informar outro número para o vetor (1-Sim, 0-Não)?");
	    resposta = in.nextInt();
	}
	
	System.out.println("-- Mostrando o vetor --");
	
	for (int i = 0; i < contador; i++) {
	    System.out.println(vetor[i]);
	}
	
	System.out.println("Informe um número para multiplicar o vetor:");
	numero = in.nextInt();
	
	for (int i = 0; i < contador; i++) {
	    vetor[i] = vetor[i] * numero;
	}
	
	System.out.println("-- Mostrando o vetor multiplicado --");
	
	for (int i = 0; i < contador; i++) {
	    System.out.println(vetor[i]);
	}
	
	in.close();
    }

}
