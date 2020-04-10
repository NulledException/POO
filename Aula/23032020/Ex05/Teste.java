package Ex05;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        int op = 0;

        Cachorro c1 = new Cachorro();
        c1.setNome("Cachorro[0]");
        System.out.println(c1.late());
        Gato g1 = new Gato();
        g1.setNome("Gato[0]");
        System.out.println(g1.mia());

        Rica r1 = new Rica();
        r1.setNome("\nRica[0]");
        System.out.println(r1.fazCompras());
        Pobre p1 = new Pobre();
        p1.setNome("Pobre[0]");
        System.out.println(p1.trabalha());
        Miseravel m1 = new Miseravel();
        m1.setNome("Miseravel[0]");
        System.out.println(m1.mendiga());

        Scanner in = new Scanner(System.in);

        System.out.println("\nDigite:\n1 = Ingresso normal\n2 = Ingresso VIP");
        op = in.nextInt();
        if (op == 1) {
            Normal n1 = new Normal();
            n1.setValor(70.0);
            System.out.println(n1.imprimeValor() + ", no valor de: " + n1.getValor());
        } else if (op == 2) {
            op = 0;
            System.out.println("Digite:\n1 = Camarote superior\n2 = Camarote inferior");
            op = in.nextInt();
            if (op == 1) {
                CamaroteSuperior cc1 = new CamaroteSuperior();
                cc1.setValor(70.0);
                cc1.setLocalizacao("S1");
                System.out.println("Camarote superior localizado na poltrona: " + cc1.getLocalizacao()
                        + ", valor do ingresso: " + cc1.getValor());
            } else if (op == 2) {
                CamaroteInferior cc2 = new CamaroteInferior();
                cc2.setValor(70.0);
                cc2.setLocalizacao("I1");
                System.out.println("Camarote inferior localizado na poltrona: " + cc2.getLocalizacao()
                        + ", valor do ingresso: " + cc2.getValor());
            } else {
            }
        } else {
        }

        op = 0;
        System.out.println("\nDigite:\n1 = Novo imovel\n2 = Velho imovel");
        op = in.nextInt();
        if (op == 1) {
            Novo n1 = new Novo();
            n1.setEndereco("Endereco[0]");
            n1.setPreco(700.0);
            n1.setAdicionalPreco(100.0);
            System.out.println("Seu imovel no: " + n1.getEndereco() + ", tem o preco de: " + n1.getPreco());
        } else if (op == 2) {
            Velho v1 = new Velho();
            v1.setEndereco("Endereco[1]");
            v1.setPreco(700);
            v1.setDescontoPreco(100.0);
            System.out.println("Seu imovel no: " + v1.getEndereco() + ", tem o preco de: " + v1.getPreco());
        } else {
        }

        Administrativo a1 = new Administrativo();
        a1.setNome("Administrativo[0]");
        a1.setNumMatricula(01);
        System.out.println("\nO assistente administrativo " + a1.getNome() + ", tem o numero de matricula igual a: "
                + a1.getNumMatricula());

        Tecnico t1 = new Tecnico();
        t1.setNome("Tecnico[0]");
        t1.setNumMatricula(02);
        System.out.println("O assistente tecnico " + t1.getNome() + ", tem o numero de matricula igual a: "
                + t1.getNumMatricula());
        in.close();

    }

}