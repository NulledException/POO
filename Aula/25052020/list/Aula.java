package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Aula {
    public static void main(String[] args) {
        List<Integer> primos = new ArrayList<>();
        List<Integer> numeros = new ArrayList<Integer>(primos);

        primos.add(2);
        primos.add(5);
        primos.add(7);
        primos.add(11);

        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas = new LinkedList<Pessoa>();

        List minhalista = new LinkedList();

        minhalista.add(new Pessoa(1, "Eduardo"));
        minhalista.add(new Pessoa(2, "Aliel"));

        Pessoa x = (Pessoa) minhalista.get(0);

        System.out.println(x);

        x = (Pessoa) minhalista.get(1);

        System.out.println(x);

        Pessoa p = new Pessoa(23, "Nicolas");

        Contato c1 = new Contato("Zebu", "telefone", "email@dominio.com");

        p.addContato(c1);

        p.addContato(new Contato("Gaubera", "telefone2", "email2@dominio.com"));

        System.out.println("Pessoa: " + p.getNome());
        System.out.println("Contatos: ");

        for (Contato c : p.getContatos()) {
            System.out.println("\t" + c.getNome());
        }
    }
}