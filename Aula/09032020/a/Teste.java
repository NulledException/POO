import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        int numero;
        Contador pares = new Contador();
        Contador impares = new Contador();

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe o " + (i + 1) + " numero: ");
            numero = in.nextInt();

            if (numero % 2 == 0) {

                pares.contaUm(numero);

            } else {

                impares.contaUm(numero);

            }

        }

        in.close();

        System.out.println("Foram encontrados " + pares.temQuantos() + " pares");
        System.out.println("A media dos pares é " + pares.media());

        System.out.println("Foram encontrados " + impares.temQuantos() + " impares");
        System.out.println("A media dos impares é " + impares.media());
    };
};