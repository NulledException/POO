package Ex04;

//A
public class Assistente extends Funcionario {
    private int numMatricula;

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return super.imprimeDados() + " Numero de Matricula=" + numMatricula;
    }
}