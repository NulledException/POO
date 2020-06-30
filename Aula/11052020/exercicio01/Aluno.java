package exercicio01;

public class Aluno extends Pessoa {

    private Curso curso;
    private float n1, n2, n3;

    public Aluno(int codigo, String nome, String email, Curso curso) {
        super(codigo, nome, email);
        this.setCurso(curso);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public float getN1() {
        return n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }

    public float getMedia() {
        return (n1 + n2 + n3) / 3;
    }

    public boolean isAprovated() {
        return this.getMedia() >= 7;
    }

    public String toString() {
        return "Aluno " + getCodigo() + ": " + getNome() + ", n1: " + n1 + " n2: " + n2 + " n3: " + n3 + ", Media: "
                + getMedia() + " " + (isAprovated() ? "Aprovado" : "Reprovado");
    }
}