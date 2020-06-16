public class funcionario implements colaborador {

    private String nome;
    private float valCargaHoraria;

    @Override
    public float obtemSalario() {
        return (valCargaHoraria * valBaseHora * 2);
    }

    @Override
    public float cargaHoraria(float valCargaHoraria) {
        this.valCargaHoraria = valCargaHoraria;
        return this.valCargaHoraria;
    }

    public funcionario() {
    }

    public funcionario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}