import java.util.Scanner;

/**
 * Salario
 */
public class Salario {

    public static void main(final String[] args) {

        final Calculos foo = new Calculos();
        float salMin;
        float salFuncionario;

        final Scanner in = new Scanner(System.in);
        System.out.println("Digite o salario minimo atual: ");
        salMin = in.nextFloat();
        foo.setSalMinimo(salMin);

        System.out.println("Digite o salario do funcionario: ");
        salFuncionario = in.nextFloat();
        foo.setSalFuncionario(salFuncionario);

        System.out.println("O funcionario em questão recebe " + foo.getQntdSalMin() + " salarios minimos");

        in.close();
    }
}