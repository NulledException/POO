import java.util.Scanner;

public class DemoTesteArray {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int tamVetor;
        
        System.out.println("Digite o tamanho do vetor desejado: ");
        tamVetor = in.nextInt();
        in.close();

        Testearray foo = new Testearray(tamVetor);
    }
}