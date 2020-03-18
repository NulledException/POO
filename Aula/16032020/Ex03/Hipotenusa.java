import java.util.Scanner;

/**
 * Hipotenusa
 */
public class Hipotenusa {

    public static void main(String[] args) {
        Calculo foo = new Calculo();
        float catA;
        float catB;

        Scanner in = new Scanner(System.in);
        System.out.println("Digite o cateto A em m: ");
        catA = in.nextFloat();
        foo.setCatA(catA);

        System.out.println("Digite o cateto B em m: ");
        catB = in.nextFloat();
        foo.setCatB(catB);


        
        System.out.println("A hipotenusa dos cateto a = " + foo.getCatA() + " e cateto b = " + foo.getCatB() + " é igual a = " + foo.getHip());

        in.close();
    }
}