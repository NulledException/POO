import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int valor;

        Scanner in = new Scanner(System.in);

        System.out.println("Digite um valor numérico: ");
        valor = in.nextInt();
        in.close();

        String extenso = "";
        String valorString = " " + valor;
        for (int i = 0; i <= (valorString.length() - 1); i++) {
            if (valorString.charAt(i) == '1') {
                extenso = extenso + "um, ";
            } else if (valorString.charAt(i) == '2') {
                extenso = extenso + "dois, ";
            } else if (valorString.charAt(i) == '3') {
                extenso = extenso + "três, ";
            } else if (valorString.charAt(i) == '4') {
                extenso = extenso + "quatro, ";
            } else if (valorString.charAt(i) == '5') {
                extenso = extenso + "cinco, ";
            } else if (valorString.charAt(i) == '6') {
                extenso = extenso + "seis, ";
            } else if (valorString.charAt(i) == '7') {
                extenso = extenso + "sete, ";
            } else if (valorString.charAt(i) == '8') {
                extenso = extenso + "oito, ";
            } else if (valorString.charAt(i) == '9') {
                extenso = extenso + "nove, ";
            } else if (valorString.charAt(i) == '0') {
                extenso = extenso + "zero, ";
            } else {
            }
        }
        System.out.println(extenso);

    }
}