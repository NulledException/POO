package a;

public class Pessoa {

    private static int lastId = 0;

    private int id;
    private String nome;

    public Pessoa(final String nome) {
        this.nome = nome;
        this.id = ++lastId;
    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public static int getLastId() {
        return lastId;
    }

    public String toString() {
        return "id = " + id + " nome = " + nome;
    }

}