/**
 * calculos
 */
public class Calculos {

    private float altura;
    private float largura;
    private float areaTotal;
    public float result;

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getAltura() {
        return this.altura;
    }

    public float getLargura() {
        return this.largura;
    }

    private float calcArea(float largura, float altura) {
        this.areaTotal = this.largura * this.altura;
        return this.areaTotal;
    }

    public float getArea() {
        this.result = calcArea(this.largura, this.altura);
        return this.result;
    }
}