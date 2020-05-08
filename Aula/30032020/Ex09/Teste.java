public class Teste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno a1 = new Aluno();

        p1.setNome("Eduardo");
        p1.setIdade(20);
        p1.setRG("rG");

        a1.setNome("Abacaxi");
        a1.setIdade(10);
        a1.setRG("rG.2");
        a1.setNumMatricula(1);

        System.out.println(p1.imprimePessoa());
        System.out.println(p1);

        System.out.println("\n" + a1.imprimeAluno());
        System.out.println(a1.imprimePessoa());
        System.out.println(a1);
    }
    
}