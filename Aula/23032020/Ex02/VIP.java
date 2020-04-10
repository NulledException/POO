package Ex02;

//A
public class VIP extends Ingresso {

    @Override
    public void setValor(double valor) {
        super.setValor(valor + (10.10));
    }

}