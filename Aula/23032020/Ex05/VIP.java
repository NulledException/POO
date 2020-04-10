package Ex05;

public class VIP extends Ingresso {

    @Override
    public void setValor(double valor) {
        super.setValor(valor + (10.10));
    }

}