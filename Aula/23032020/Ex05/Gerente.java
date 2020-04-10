package Ex05;

public class Gerente extends Funcionario {
    private String nivelGerencia;

    public Gerente() {
        this.nivelGerencia = "Nivel 1";
    }

    public String getNivelGerencia() {
        return nivelGerencia;
    }

    public void setNivelGerencia(String nivelGerencia) {
        this.nivelGerencia = nivelGerencia;
    }

    @Override
    public String toString() {
        return super.imprimeDados() + " Nivel de Gerencia=" + nivelGerencia;
    }

}