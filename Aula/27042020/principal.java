public class principal {
    public static void main(String[] args) {
        colaborador[] a = new colaborador[5];

        a[0] = new professorGraduacao("eu");
        a[1] = new professorTecnico("tu");
        a[2] = new estagiario("nois");
        a[3] = new funcionario("ela");

        for (int i = 0; i < (a.length - 1); i++) {
            a[i].cargaHoraria(44);
            System.out.println("\nSalario de " + a[i] + " é de: " + a[i].obtemSalario());
        }

    }
}