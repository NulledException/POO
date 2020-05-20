import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        String texto;
        int prox;
        int count;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        texto = in.nextLine();
        in.close();

        System.out.println("O texto contem " + texto.length() + " caracteres");

        prox = 0;
        for (count = 0; texto.indexOf(" ", prox) >= 0; count++) {
            prox = texto.indexOf(" ", prox) + 1;
        }
        System.out.println("O texto contem " + (count + 1) + " palavras");
    }
}