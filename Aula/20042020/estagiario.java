public class estagiario implements colaborador {

    String nome;
    float valCargaHoraria;

    @Override
    public float obtemSalario() {
        return (valCargaHoraria * valBaseHora);
    }

    @Override
    public float cargaHoraria(float valCargaHoraria) {
        this.valCargaHoraria = valCargaHoraria;
        return this.valCargaHoraria;
    }

    public estagiario() {
    }

    public estagiario(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }

}