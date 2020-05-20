import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        String texto;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um texto: ");
        texto = in.nextLine();
        in.close();
        System.out.println(texto);
    }

}