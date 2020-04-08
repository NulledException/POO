/**
 * Calculo
 */
public class Calculo {

    private float a;
    private float b;
    private float hip;
    private double result;

    public float getCatA() {
        return this.a;
    }

    public float getCatB() {
        return this.b;
    }

    public void setCatA(float a) {
        this.a = a;
    }

    public void setCatB(float b) {
        this.b = b;
    }

    private float quadradoA() {
        this.a = this.a * this.a;
        return this.a;
    }

    private float quadradoB() {
        this.b = this.b * this.b;
        return this.b;
    }

    private float calcHip() {
        this.hip = quadradoA() + quadradoB();
        this.result = Math.sqrt(this.hip);
        return (float) result;
    }

    public float getHip() {
        return calcHip();
    }
}