import java.util.Scanner;

/**
 * Cavalos
 */
public class Cavalos {
    public static void main(String[] args) {
        Calculos foo = new Calculos();
        int cavalosComprados;
        int qntdFerraduras;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numero de cavalos que necessitam de ferradura: ");
        cavalosComprados = in.nextInt();
        foo.setCavalos(cavalosComprados);

        
        System.out.println("Voce vai precisar de " + foo.getFerraduras() + " ferraduras para os seus " + foo.getCavalos() + " cavalos.");

        in.close();
    }
    
}