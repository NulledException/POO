import java.util.Scanner;

public class PreencheVetor {
    public static void main(String[] args) {
        int[] array = new int[10];
        int multi;
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Digite um valor para armazenar na posição " + (i + 1) + " do vetor:");
            array[i] = in.nextInt();
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor na posição " + (i + 1) + " do vetor:" + array[i]);
        }
        
        System.out.println("\nDigite um valor para multiplicar todos os numeros do vetor:");
        multi = in.nextInt();

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * multi;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor na posição" + (i + 1) + "do vetor:" + array[i]);
        }
        in.close();
    }
}