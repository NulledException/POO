package exercicio01;

public class Instituicao {

    public static final int MAXIMO_TURMAS = 30;

    public String nome;

    private Curso[] cursos;
    private Turma[] turmas;
    private int count;

    public Instituicao(String nome) {

        this.nome = nome;

        cursos = new Curso[4];
        cursos[0] = new Curso(1, "Ciência de Computação");
        cursos[1] = new Curso(2, "Sistemas de Informação");
        cursos[2] = new Curso(3, "Engenharia de Computação");
        cursos[3] = new Curso(4, "Análise e Desenvolvimento de Sistemas");

        turmas = new Turma[MAXIMO_TURMAS];

    }

    public void adicionaTurma(Turma turma) {
        if (count < MAXIMO_TURMAS) {
            turmas[count] = turma;
            count++;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Curso getCurso(int codigo) {
        if (codigo < 1 || codigo > 4) {
            return null;
        } else {
            return cursos[codigo - 1];
        }
    }

    public String toString() {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < count; i++) {
            sb.append(turmas[i].getResumoTurma() + "\n");
        }
        return "Instituição " + nome + "\n" + "\nTurmas: \n" + sb.toString() + "\nAlunos: " + qntdAlunos()
                + "\nAprovados: " + qntdAlunosAprovados() + ", Percentual: " + getPercentualAprovacao() + "%";
    }

    public int qntdAlunos() {
        int qntd = 0;
        for (int i = 0; i < count; i++) {
            qntd += turmas[i].qntdAlunos();
        }
        return qntd;
    }

    public int qntdAlunosAprovados() {
        int qntd = 0;
        for (int i = 0; i < count; i++) {
            qntd += turmas[i].qntdAprovados();
        }
        return qntd;
    }

    public float getPercentualAprovacao() {
        return (float) qntdAlunosAprovados() / qntdAlunos() * 100;
    }

    public String mostraTurmas(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(turmas[i].getResumoTurma()+"\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {

        Instituicao ins = new Instituicao("ucs");
        System.out.println(ins.getCurso(3));

        Professor p = new Professor(1, "Cagol", "email@dominio.com", "bg");
        System.out.println("\n" + p);

        Aluno a = new Aluno(1, "Eduardo", "email@dominio.com", ins.getCurso(3));
        a.setN1(10);
        a.setN2(9);
        a.setN3(8);
        System.out.println("\n" + a);

        Aluno b = new Aluno(2, "Jose", "email@dominio.com", ins.getCurso(2));
        b.setN1(5);
        b.setN2(6);
        b.setN3(7);

        Aluno c = new Aluno(3, "Maria", "email@dominio.com", ins.getCurso(1));
        c.setN1(10);
        c.setN2(6);
        c.setN3(7);

        Turma t = new Turma("123-4", "POO");
        t.setProfessor(p);
        t.adicionaAluno(a);
        t.adicionaAluno(b);
        t.adicionaAluno(c);
        System.out.println("\n" + t);

        Professor p2 = new Professor(1, "Nicolas", "email@dominio.com", "bg");
        System.out.println("\n" + p);

        Aluno d = new Aluno(3, "Maria Jose", "email@dominio.com", ins.getCurso(1));
        d.setN1(10);
        d.setN2(6);
        d.setN3(7);

        Turma t2 = new Turma("012-3", "EC");
        t2.setProfessor(p2);
        t2.adicionaAluno(a);
        t2.adicionaAluno(b);
        t2.adicionaAluno(c);
        t2.adicionaAluno(d);
        System.out.println("\n" + t2);

        ins.adicionaTurma(t);
        ins.adicionaTurma(t2);
        System.out.println("\n" + ins);
    }
}