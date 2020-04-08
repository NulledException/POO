package Ex04;

/**
 * Funcionario
 */
public class Funcionario {

    private String nome;
    private String CPF;
    private String RG;
    private double aumento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String rG) {
        RG = rG;
    }

    public double getAumento() {
        return aumento;
    }

    public void setAumento(double aumento) {
        this.aumento = aumento;
    }

    public String imprimeDados() {
        return "Funcionario [nome=" + nome + ", CPF=" + CPF + ", RG=" + RG + "]";
    }

}