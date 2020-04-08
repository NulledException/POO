package b;

public class TestePessoa {

    public static void main(String[] args) {
        PessoaFisica f1 = new PessoaFisica();
        PessoaJuridica j1 = new PessoaJuridica();
        Industria i1 = new Industria();

        f1.setNome("nome");
        f1.setTelefone(996565583);
        f1.setCPF("036.314.390-40");

        j1.setNome("nome2");
        j1.setTelefone(995656683);
        j1.setCNPJ("36.318.612/0001-40");

        i1.setNome("nome3");
        i1.setTelefone(995454472);
        i1.setCNPJ("15.698.547/0008-70");
        i1.setRamoAtividade("desenvolvedor");

        System.out.println(i1.pessoaString() + i1);
        System.out.println(j1.pessoaString() + j1);
        System.out.println(f1.pessoaString() + f1);

    }
}