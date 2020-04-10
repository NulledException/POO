package Ex03;

//A
public class Novo extends Imovel {
    private double adicionalPreco;

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
        setPreco(getPreco() + this.adicionalPreco);
    }

}