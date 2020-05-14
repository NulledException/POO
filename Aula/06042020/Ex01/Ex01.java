import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {

        String frase;
        int count;


        Scanner in = new Scanner(System.in);

        System.out.println("Digite uma frase para a analise:");
        frase = in.nextLine();
        
        in.close();

        System.out.println("\nTamanho: " + frase.length());


        System.out.println("Maiusculo: " + frase.toUpperCase());


        count = 0;
        int i;
        for (i = 0; i <= (frase.length() - 1); i++) {

            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'A') {
                count++;
            } else if (frase.charAt(i) == 'e' || frase.charAt(i) == 'E') {
                count++;
            } else if (frase.charAt(i) == 'i' || frase.charAt(i) == 'I') {
                count++;
            } else if (frase.charAt(i) == 'o' || frase.charAt(i) == 'O') {
                count++;
            } else if (frase.charAt(i) == 'u' || frase.charAt(i) == 'U') {
                count++;
            } else {
            }
        }
        System.out.println("Vogais: " + count);


        String maiusculo = frase;
        maiusculo = maiusculo.toUpperCase();
        System.out.println("Comeca com UNI: " + maiusculo.startsWith("UNI"));
        System.out.println("Termina com SUL: " + maiusculo.endsWith("SUL"));


        count = 0;
        for (i = 0; i <= (frase.length() - 1); i++) {

            if (frase.charAt(i) == '0') {
                count++;
            } else if (frase.charAt(i) == '1') {
                count++;
            } else if (frase.charAt(i) == '2') {
                count++;
            } else if (frase.charAt(i) == '3') {
                count++;
            } else if (frase.charAt(i) == '4') {
                count++;
            } else if (frase.charAt(i) == '5') {
                count++;
            } else if (frase.charAt(i) == '6') {
                count++;
            } else if (frase.charAt(i) == '7') {
                count++;
            } else if (frase.charAt(i) == '8') {
                count++;
            } else if (frase.charAt(i) == '9') {
                count++;
            } else{
            }
        }
        System.out.println("Digitos de 0 a 9: " + count);


    }
}