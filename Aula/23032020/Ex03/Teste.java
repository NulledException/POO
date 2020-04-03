package Ex03;

public class Teste {
    public static void main(String[] args) {
        Imovel i1 = new Imovel();

        i1.setEndereco("Endereco[0]");
        i1.setPreco(100.0);

        System.out.println(i1);

        Novo n1 = new Novo();

        n1.setEndereco("Endereco[1]");
        n1.setPreco(100.0);
        n1.setAdicionalPreco(10.0);

        System.out.println("Novo: " + n1);

        Velho v1 = new Velho();

        v1.setEndereco("Endereco[2]");
        v1.setPreco(100.0);
        v1.setDescontoPreco(10.0);

        System.out.println("Velho: " + v1);
    }

}