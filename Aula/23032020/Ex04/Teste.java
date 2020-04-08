package Ex04;

public class Teste {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();

        f1.setNome("Funcionario[0]");
        f1.setCPF("036.314.390-40");
        f1.setRG("1114112681");
        f1.setAumento(0.10);

        System.out.println(f1.imprimeDados());

        Gerente g1 = new Gerente();

        g1.setNome("Gerente[0]");
        g1.setCPF("067615691-41");
        g1.setRG("1124122782");
        g1.setAumento(0.15);
        g1.setNivelGerencia("Nivel ");
    }

}