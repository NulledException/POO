import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        String frase;
        String invertida = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        frase = in.nextLine();
        in.close();

        for (int i = 0; i == 0; i++) {
            for (int j = (frase.length() - 1); j >= 0; j--) {
                invertida = invertida + frase.charAt(j);
            }
        }
        System.out.println(invertida);
    }
}