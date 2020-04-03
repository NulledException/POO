package Ex03;

public class Novo extends Imovel{
    private double adicionalPreco;

    public void setAdicionalPreco(double adicionalPreco) {
        this.adicionalPreco = adicionalPreco;
        setPreco(getPreco() + this.adicionalPreco);
    }

}