package exercicioavaliativo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Forca {

    public static final String[] PALAVRAS = { "CORPO", "INSETICIDA", "CARROS", "BICICLETA", "PASTILHA", "MEL",
            "ORIENTAL", "TURISMO", "CIGANO", "FALHAR", "ENCORAJO", "CHAMADA", "PRECIOSO", "SOFRER", "PORCA",
            "GUARDANAPO", "FALSIFICAR", "MOCHILA", "CARICATURA", "LAB", "ESTADO", "RIFLE", "CACHOEIRA", };
    public static final Random RANDOM = new Random();
    public static final int MAXIMO_ERROS = 6;

    private String palavraOculta;
    private char[] imprimePalavra;
    private int numErros;

    private ArrayList<String> letras = new ArrayList<>();

    public boolean imprimePalavra() {
        return palavraOculta.contentEquals(new String(imprimePalavra));
    }

    private String retornaPronta() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < imprimePalavra.length; i++) {
            sb.append(imprimePalavra[i]);

            if (i < imprimePalavra.length - 1) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    private String sorteiaPalavra() {
        return PALAVRAS[RANDOM.nextInt(PALAVRAS.length)];
    }

    private void checaLetra(String letra) {
        if (!letras.contains(letra)) {
            if (palavraOculta.contains(letra)) {
                int i = palavraOculta.indexOf(letra);
                while (i >= 0) {
                    imprimePalavra[i] = letra.charAt(0);
                    i = palavraOculta.indexOf(letra, i + 1);
                }
            } else {
                numErros++;
            }

            letras.add(letra);
        }
    }

    public void novoJogo() {
        numErros = 0;
        letras.clear();
        palavraOculta = sorteiaPalavra();

        imprimePalavra = new char[palavraOculta.length()];

        for (int i = 0; i < imprimePalavra.length; i++) {
            imprimePalavra[i] = '_';
        }
    }

    public void imprimeBoneco(int vidas) {
        switch (vidas) {
            case 0:
                System.out.println(" ----\n |  |\n |  o\n | /0\\\n | / \\\n |\n |\n---");
                break;
            case 1:
                System.out.println(" ----\n |  |\n |  o\n | /0\\\n | /\n |\n |\n---");
                break;
            case 2:
                System.out.println(" ----\n |  |\n |  o\n | /0\\\n |\n |\n |\n---");
                break;
            case 3:
                System.out.println(" ----\n |  |\n |  o\n | /0\n |\n |\n |\n---");
                break;
            case 4:
                System.out.println(" ----\n |  |\n |  o\n | /\n |\n |\n |\n---");
                break;
            case 5:
                System.out.println(" ----\n |  |\n |  o\n |\n |\n |\n |\n---");
                break;
            case 6:
                System.out.println(" ----\n |  |\n |\n |\n |\n |\n |\n---");
                break;
            default:
                System.out.println(" ");
                break;
        }
    }

    public void jogar() {
        try (Scanner in = new Scanner(System.in)) {
            while (numErros < MAXIMO_ERROS) {
                System.out.println("\nDigite uma letra : ");
                String letra = in.next();
                letra = letra.toUpperCase();

                if (letra.length() > 1) {
                    letra = letra.substring(0, 1);
                } else {
                }

                checaLetra(letra);

                System.out.println("\n" + retornaPronta());

                if (imprimePalavra()) {
                    System.out.println("\nParabéns!");
                    System.out.println("Você Ganhou!");
                    break;
                } else {
                    int vidas = (MAXIMO_ERROS - numErros);
                    imprimeBoneco(vidas);
                    System.out.println("Numero de vidas restante : " + (MAXIMO_ERROS - numErros));
                }
            }

            if (numErros == MAXIMO_ERROS) {
                System.out.println("\nGame Over!");
                System.out.println("A palavra era : " + palavraOculta);
            }
        }
    }
}