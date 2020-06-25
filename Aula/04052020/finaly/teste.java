package finaly;

import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro numero: ");
            String resposta = in.nextLine();
            double nr1 = Double.parseDouble(resposta);

            System.out.println("Digite o segundo numero: ");
            resposta = in.nextLine();
            double nr2 = Double.parseDouble(resposta);

            double resultado = nr1 + nr2;

            System.out.println("A soma é " + resultado);
        } catch (NumberFormatException nfe) {
            System.out.println("Não é possivel somar coisas que não são numeros");
        }finally{
            in.close();
        }
    }
}