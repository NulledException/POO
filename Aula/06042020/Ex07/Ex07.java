import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        String nome;
        String abreviado = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome completo: ");
        nome = in.nextLine();
        in.close();

        int prox;
        for (prox = 0; nome.indexOf(" ", prox) >= 0;) {
            if (prox == 0) {
                abreviado = nome.charAt(0) + ".";
                abreviado.toUpperCase();
            }
            prox = nome.indexOf(" ", prox) + 1;

            abreviado = abreviado + nome.charAt(prox) + ".";
        }
        System.out.println(abreviado.toUpperCase());

    }
}