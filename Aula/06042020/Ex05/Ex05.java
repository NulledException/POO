import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        String frase;
        String palavra;
        String palavra2;
        String novaFrase;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = in.nextLine();
        System.out.println("Digite uma palavra da frase \"" + frase + "\" para substituir:");
        palavra = in.nextLine();
        System.out.println("Digite a palavra que voce deseja substituir por \"" + palavra + "\":");
        palavra2 = in.nextLine();
        in.close();

        if (frase.indexOf(palavra) >= 0) {
            novaFrase = frase.replace(palavra, palavra2);
            System.out.println(novaFrase);
        } else {
        }

    }
}