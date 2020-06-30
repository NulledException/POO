package exercicio01;

import java.util.Scanner;

public class Main {

    Instituicao ins;

    public Main() {
        ins = new Instituicao("UCS");
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int opcao;
        Main main = new Main();
        do {
            mostraMenu();
            opcao = in.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println(main.ins);
                    espera();
                    break;
    
                case 2:

                    break;

                case 3:

                    break;

                case 4:

                    break;

                default:

                    break;
            }
            in.nextLine();
            System.out.println("Informe sua opção: ");
            opcao = in.nextInt();
        } while (opcao != 5);

        in.close();
    }

    public static void mostraMenu() {
        System.out.println("------------------------------------------------------------" + "\nInstituição UCS"
                + "\n------------------------------------------------------------"
                + "\nEscolha uma das opções a seguir:" + "\n1) Listar todas as turmas"
                + "\n2) Informar dados de uma turma" + "\n3) Consultar os dados de uma turma"
                + "\n4) Consultar estatísticas gerais" + "\n5) Sair do sistema"
                + "\n------------------------------------------------------------" + "\n");
    }

    public static void espera() {
        System.out.println("Pressione uma tecla para continuar.");
        try {
            System.in.read();
        } catch (Exception e) {
        }
    }
}