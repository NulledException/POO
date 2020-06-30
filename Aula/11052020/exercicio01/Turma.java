package exercicio01;

public class Turma {

    public static final int MAXIMO_ALUNOS = 30;

    private String codigo;
    private String disciplina;
    private Professor professor;
    private Aluno[] alunos;
    private int count;

    public Turma() {
        this.alunos = new Aluno[MAXIMO_ALUNOS];
        this.count = 0;
    }

    public Turma(String codigo, String disciplina) {
        this();
        this.codigo = codigo;
        this.disciplina = disciplina;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void adicionaAluno(Aluno aluno) {
        if (count < MAXIMO_ALUNOS) {
            alunos[count] = aluno;
            count++;
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(alunos[i] + "\n");
        }
        return "Turma " + getCodigo() + ": " + getDisciplina() + "\nProfessor: "
                + (professor == null ? "Indefinido" : professor.getNome()) + "\nQuantidade de alunos: " + count
                + "\nAlunos: \n" + sb.toString() + "Aprovados: " + qntdAprovados() + ", Percentual: "
                + getPercentualAprovacao() + "%";
    }

    public int qntdAlunos() {
        return count;
    }

    public int qntdAprovados() {
        int aprovados = 0;
        for (int i = 0; i < count; i++) {
            if (alunos[i].isAprovated()) {
                aprovados++;
            }
        }
        return aprovados;
    }

    public float getPercentualAprovacao() {
        return (float) qntdAprovados() / qntdAlunos() * 100;
    }

    public String getResumoTurma() {
        return "Turma " + getCodigo() + ": " + getDisciplina() + ", Professor: "
                + (professor == null ? "Indefinido" : professor.getNome()) + ", Quantidade de alunos: " + count
                + " Aprovados: " + qntdAprovados() + ", Percentual: " + getPercentualAprovacao() + "%";
    }
}