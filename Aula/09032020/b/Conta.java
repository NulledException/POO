/**
 * Conta
 */
public class Conta {

    private float saldo;

    public float depositar(float deposito) {
        saldo += deposito;
        return saldo;
    }

    public float sacar(float saque) {
        saldo -= saque;
        return saldo;
    }

    public float qntdSaldo() {
        return saldo;
    }
};