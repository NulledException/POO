public class professorGraduacao implements professor {

    private String nome;
    private float valCargaHoraria;

    @Override
    public float obtemTitulacao() {
        // Graduação : sem adicional
        // Mestrado : adicional de 20%
        // Doutorado : adicional de 50%
        return (float) (valBaseHora * 0.2);
    };

    @Override
    public float obtemSalario() {
        return (valCargaHoraria * valBaseHora * 4 * obtemTitulacao());
    }

    @Override
    public float cargaHoraria(float valCargaHoraria) {
        this.valCargaHoraria = valCargaHoraria;
        return this.valCargaHoraria;
    }

    public professorGraduacao() {
    }

    public professorGraduacao(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return ("*" + this.nome);
    }

}