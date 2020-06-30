package exercicio01;

public class Professor extends Pessoa {
    
    private String localFormacao;

    public Professor(int codigo, String nome, String email, String localFormacao) {
        super(codigo, nome, email);
        this.setLocalFormacao(localFormacao);
    }

    public String getLocalFormacao() {
        return localFormacao;
    }

    public void setLocalFormacao(String localFormacao) {
        this.localFormacao = localFormacao;
    }
    public String toString() {
        return "Professor " + getCodigo() + ": " + getNome();
    }

}