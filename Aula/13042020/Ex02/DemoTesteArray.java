import java.util.Scanner;

public class DemoTesteArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamVetor;

        System.out.println("Digite o tamanho do vetor desejado: ");
        tamVetor = in.nextInt();

        Testearray foo = new Testearray(tamVetor);
        Testearray foo2 = new Testearray();
        int[] array = new int[3];
        int num;
        array[0] = 0;
        array[1] = 1;
        array[2] = 2;

        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor na posição " + (i+1) +" antes de chamar o metodo: " + array[i]);
        }
        System.out.println("\nDigite o valor para armazenar na posição 1 do vetor");
        num = in.nextInt();

        foo2.recebeArray(array, 2, num);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Valor na posição " + (i+1) +" depois de chamar o metodo: " + array[i]);
        }
        
        in.close();
    }
}