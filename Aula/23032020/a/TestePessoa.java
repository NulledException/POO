package a;

public class TestePessoa {

    public static void main(String[] args) {

        Pessoa foo = new Pessoa("Eduardo");

        System.out.println(foo);

        Pessoa foo2 = new Pessoa("Jean");

        System.out.println(foo2);

        System.out.println(foo.getId());
        System.out.println(foo2.getId());

        System.out.println(foo.getLastId());
        System.out.println(foo2.getLastId());
    }
}