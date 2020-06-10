
public class Automovel {
    private String marca;
    private String nome;
    private String cor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
        if(cor == null){
            this.cor = null;
        }
    }

    @Override
    public String toString() {
        return "Automovel [cor=" + cor + ", marca=" + marca + ", nome=" + nome + "]";
    }

}