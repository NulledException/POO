import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        String frase;
        String novaFrase = "";
        char alfabeto[] = { ' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
                'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        int j;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase para ser encriptada: ");
        frase = in.nextLine();
        System.out.println("Digite o valor de J: ");
        j = in.nextInt();
        in.close();
        for (int i = 0; i < frase.length(); i++) {
            for (int l = 0; l < 26; l++) {
                String letra = "" + alfabeto[l];
                String letraFrase = "" + frase.charAt(i);
                letra = letra.trim();
                letraFrase = letraFrase.trim();

                if (letraFrase.equalsIgnoreCase(letra)) {
                    novaFrase = novaFrase + alfabeto[(l + j)];
                } else {
                }
            }
        }
        System.out.println(novaFrase);
    }
}