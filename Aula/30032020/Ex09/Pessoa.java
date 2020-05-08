/**
 * Pessoa
 */
public class Pessoa {

    private String nome;
    private int idade;
    private String RG;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    @Override
    public String toString() {
        return "Pessoa [RG=" + RG + ", idade=" + idade + ", nome=" + nome + "]";
    }

    public String imprimePessoa() {
        return "Pessoa [RG=" + RG + ", idade=" + idade + ", nome=" + nome + "]";
    }
}