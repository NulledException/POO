import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        String frase;
        String frase1;
        int count;
        int i;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite a primeira string: ");
        frase = in.nextLine();
        System.out.println("Digite a segunda string: ");
        frase1 = in.nextLine();
        in.close();

        if (frase.indexOf(frase1) == -1) {
            System.out.println("Não foi encontrada");

        } else {
            count = 0;
            for (i = 0; frase.indexOf(frase1, i) >= 0; count++) {
                i = frase.indexOf(frase1, i) + frase1.length();
            }
            System.out.println("A String 2 aparece " + count + " vezes na String 1");
        }
    }
}