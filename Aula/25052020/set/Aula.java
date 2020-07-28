package set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aula {
    public static void main(String[] args) {

        System.out.println("\nHashSet:\n");

        Set<String> personagens = new HashSet<>();

        personagens.add("Perseu");
        personagens.add("Perseu");
        personagens.add("Batman");
        personagens.add("Coringa");
        personagens.add("Robin");
        personagens.add("perseu");
        personagens.add("Spirit");
        personagens.add("Alerquina");

        for (String nome : personagens) {
            System.out.println(nome);
        }

        System.out.println("\nTreeSet:\n");

        personagens = new TreeSet<>();

        personagens.add("Perseu");
        personagens.add("Batman");
        personagens.add("coringa");
        personagens.add("Robin");
        personagens.add("Perseu");
        personagens.add("Spirit");
        personagens.add("Alerquina");

        for (String nome : personagens) {
            System.out.println(nome);
        }
    }
}