import java.util.Scanner;

/**
 * Losango
 */
public class Losango {

    public static void main(String[] args) {

        Calculos foo = new Calculos();
        float diagonalMaior;
        float diagonalMenor;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o valor da diagonal maior em m: ");
        diagonalMaior = in.nextFloat();
        foo.setDiagonalMaior(diagonalMaior);

        System.out.println("Digite o valor da diagonal menor em m: ");
        diagonalMenor = in.nextFloat();
        foo.setDiagonalMenor(diagonalMenor);

        System.out.println("A area total do losango é de: " + foo.getAreaLosango() + "m²");

        in.close();
    }
}