package Ex01;

public class Heranca {

    public static void main(String[] args) {

        Animal a1 = new Animal();

        a1.setNome("Animal[0]");
        a1.setRaca("Raca[0]");

        System.out.println(a1.getNome());
        System.out.println(a1.getRaca());
        System.out.println(a1.caminha());

        Cachorro c1 = new Cachorro();

        c1.setNome("Cachorro[0]");
        c1.setRaca("Vira-lata");

        System.out.println("\n" + c1.getNome());
        System.out.println(c1.getRaca());
        System.out.println(c1.caminha());
        System.out.println(c1.late());

        Gato g1 = new Gato();

        g1.setNome("Gato[0]");
        g1.setRaca("Indefinida");

        System.out.println("\n" + g1.getNome());
        System.out.println(g1.getRaca());
        System.out.println(g1.caminha());
        System.out.println(g1.mia());

        Pessoa pp1 = new Pessoa();

        pp1.setNome("Pessoa[0]");
        pp1.setIdade(20);

        System.out.println("\n" + pp1.getNome());
        System.out.println(pp1.getIdade());

        Rica r1 = new Rica();

        r1.setNome("Rica[0]");
        r1.setIdade(21);
        r1.setDinheiro(22.23);

        System.out.println("\n" + r1.getNome());
        System.out.println(r1.getIdade());
        System.out.println(r1.getDinheiro());
        System.out.println(r1.fazCompras());

        Pobre p1 = new Pobre();

        p1.setNome("Pobre[0]");
        p1.setIdade(24);

        System.out.println("\n" + p1.getNome());
        System.out.println(p1.getIdade());
        System.out.println(p1.trabalha());

        Miseravel m1 = new Miseravel();

        m1.setNome("Miseravel[0]");
        m1.setIdade(25);

        System.out.println("\n" + m1.getNome());
        System.out.println(m1.getIdade());
        System.out.println(m1.mendiga());
    }

}