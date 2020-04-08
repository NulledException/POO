package Ex04;

public class Gerente extends Funcionario {
    private String nivelGerencia;

    public String getNivelGerencia() {
        return nivelGerencia;
    }

    public void setNivelGerencia(String nivelGerencia) {
        this.nivelGerencia = nivelGerencia;
    }

    @Override
    public String toString() {
        return "Gerente [nivelGerencia=" + nivelGerencia + "]";
    }

}