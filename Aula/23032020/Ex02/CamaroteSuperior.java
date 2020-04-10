package Ex02;

//C
public class CamaroteSuperior extends CamaroteInferior {

    @Override
    public void setValor(double valor) {
        super.setValor(valor + (10.10));
    }
}