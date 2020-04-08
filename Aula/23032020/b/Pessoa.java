package b;

public abstract class Pessoa {

    private String nome;
    private int telefone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String pessoaString() {
        return "Pessoa [nome=" + this.nome + ", telefone=" + this.telefone + "]";
    }

}