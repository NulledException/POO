/**
 * Calculos
 */
public class Calculos {

    private String nome;
    private int idade;
    private int diasDVida;
    private float bisexto;

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

    public int getDiasDVida() {
        return setDiasDVida();
    }

    private int setDiasDVida() {
        this.bisexto = this.idade/4;
        this.diasDVida = ((getIdade()*365) + this.bisexto);
        return this.diasDVida;
    }

}