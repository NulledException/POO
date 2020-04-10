package Ex03;

//B
public class Velho extends Imovel {

    private double descontoPreco;

    public void setDescontoPreco(double descontoPreco) {
        this.descontoPreco = descontoPreco;
        setPreco(getPreco() - this.descontoPreco);
    }
}