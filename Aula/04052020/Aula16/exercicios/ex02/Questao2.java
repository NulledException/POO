package Aula16.exercicios.ex02;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try {
            System.out.println("Eu sei dividir");
            System.out.println("Informe o primeiro valor: ");
            int x = teclado.nextInt();
            System.out.println("Informe o segundo valor: ");
            int y = teclado.nextInt();
            double r = (x / y);
            System.out.println("O resultado da divisão é: " + r);
        } catch (Exception e) {
            System.out.println("Não foi possivel realizara divisão. Tente novamente mais tarde");
        } finally {
            teclado.close();
        }

        // nesse programa a leitura dos valores deve ser feita, mesmo que para isso o
        // usuário tenha que tentar informar várias vezes os valores na mesma execução
        // do programa.
    }
}