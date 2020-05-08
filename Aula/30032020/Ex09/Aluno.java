public class Aluno extends Pessoa {

    private int numMatricula;

    public Aluno() {
    }

    public int getNumMatricula() {
        return numMatricula;
    }

    public void setNumMatricula(int numMatricula) {
        this.numMatricula = numMatricula;
    }

    @Override
    public String toString() {
        return "Aluno [numMatricula=" + numMatricula + "]";
    }

    public String imprimeAluno() {
        return "Aluno [RG=" + getRG() + ", idade=" + getIdade() + ", nome=" + getNome() + ", numMatricula="
                + this.numMatricula;
    }

}