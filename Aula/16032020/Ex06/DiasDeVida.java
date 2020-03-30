import java.util.Scanner;

public class DiasDeVida {

    public static void main(String[] args) {

        Calculos foo = new Calculos();
        int idade;
        String nome;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = in.nextLine();
        foo.setNome(nome);
        
        System.out.println("Digite sua idade: ");
        idade = in.nextInt();
        foo.setIdade(idade);

        System.out.println(foo.getNome() + ", voce ja viveu " + foo.getDiasDVida() + " dias");

        in.close();
    }
}