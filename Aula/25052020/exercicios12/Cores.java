package exercicios12;

import java.util.ArrayList;
import java.util.List;

public class Cores {
    public static void main(String[] args) {
        
        List<String> cores = new ArrayList<>();

        cores.add("vermelho");
        cores.add("amarelo");
        cores.add("azul");
        cores.add("preto");
        cores.add("branco");
        
        for (String string : cores) {
            System.out.println(string);
        }
    }
}