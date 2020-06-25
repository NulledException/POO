package conta;

public class teste {
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria("012-3");
        c1.depositar(600);
        ContaBancaria c2 = new ContaBancaria("123-4");
        c2.depositar(400);

        try {
            c1.sacar(500);
            System.out.println("c1 Saque Efetuado com sucesso");
        } catch (SaldoInsuficienteException e) {
            double saldo = c1.getSaldo();
            System.out.println("c1 O saque não foi possivel");
            System.out.println("c1 Voce só tem R$ " + saldo);
        }
        try {
            c2.sacar(500);
            System.out.println("c2 Saque Efetuado com sucesso");
        } catch (SaldoInsuficienteException e) {
            double saldo = c2.getSaldo();
            System.out.println("c2 O saque não foi possivel");
            System.out.println("c2 Voce só tem R$ " + saldo);
        }
    }
}