package b;

public class PessoaFisica extends Pessoa {

    private String CPF;

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica [CPF=" + CPF + "]";
    }
}