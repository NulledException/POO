/**
 * Calculos
 */
public class Calculos {

    private String nome;
    private int idade;
    private int diasDVida;

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
        this.diasDVida = (idade*365);
        return this.diasDVida;
    }

}