// Refaça o exercício anterior, para uma quantidade incerta de elementos. Ao final de
// cada número solicitado ao usuário, o programa deve perguntar se o usuário quer
// continuar fornecendo números. Quando este não quiser mais, apresente o vetor
// informado, solicite um número, faça a multiplicação deste pelo vetor e apresente o vetor
// multiplicado.

import java.util.Scanner;

public class PreencheVetorIndef {
    public static void main(String[] args) {
        int[] array = new int[10];
        int multi;
        String resposta = "s";
        Scanner in = new Scanner(System.in);

        do {
            for (int i = 0; i < array.length && resposta.equalsIgnoreCase("s"); i++) {
                System.out.println("Digite um valor para armazenar na posição " + (i + 1) + " do vetor:");
                array[i] = in.nextInt();
            }
            System.out.println("Voce deseja continuar fornecendo numeros? \"S\" = Sim \"N\" = Não:");
            resposta = in.nextLine();

        } while (resposta.equalsIgnoreCase("s"));

        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor na posição " + (i + 1) + " do vetor:" + array[i]);
        }

        System.out.println("\nDigite um valor para multiplicar todos os numeros do vetor:");
        multi = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * multi;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor na posição " + (i + 1) + " do vetor:" + array[i]);
        }
        in.close();
    }
}