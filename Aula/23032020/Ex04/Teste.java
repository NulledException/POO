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
        g1.setCPF("067.615.691-41");
        g1.setRG("1124122782");
        g1.setAumento(0.15);
        g1.setNivelGerencia("Nivel ");

        System.out.println(g1);
        
        Assistente a1 = new Assistente();

        a1.setNome("Assistente[0]");
        a1.setCPF("098.916.992-42");
        a1.setRG("1134132983");
        a1.setAumento(0.0);
        a1.setNumMatricula(01);

        System.out.println(a1);

        Administrativo aa1 = new Administrativo();

        aa1.setNome("Administrativo[0]");
        aa1.setCPF("037.0319.360-40");
        aa1.setRG("1151147885");
        aa1.setAumento(0.0);
        aa1.setNumMatricula(02);
        aa1.setTurno("dia");

        System.out.println(aa1);

        Tecnico t1 = new Tecnico();

        t1.setNome("Tecnico[0]");
        t1.setCPF("038.316.340-40");
        t1.setRG("1161189654");
        t1.setAumento(0.0);
        t1.setNumMatricula(03);
        t1.setBonusSalarial(150);

        System.out.println(t1);
    }

}