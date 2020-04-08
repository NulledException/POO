/**
 * Calculos
 */
public class Calculos {

    private int cavalosComprados;
    private int totalFerraduras;
    private static final int FERRADURAS = 4;

    public int getCavalos() {
        return this.cavalosComprados;
    }

    public void setCavalos(int cavalosComprados) {
        this.cavalosComprados = cavalosComprados;
    }

    private int calculoFerraduras(int cavalosComprados) {
        this.totalFerraduras = this.cavalosComprados * FERRADURAS;
        return this.totalFerraduras;
    }

    public int getFerraduras() {
        return calculoFerraduras(this.cavalosComprados);
    }
}