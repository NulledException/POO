package Ex01;

public class Rica extends Pessoa {

    private double dinheiro;

    public double getDinheiro() {
        return dinheiro;
    }

    public void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }

    public String fazCompras() {
        return this.getNome() + " esta fazendo compras";
    }

}