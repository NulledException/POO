public class Ponto {

    private double x;
    private double y;

    public void setX(double xVal) {
        x = xVal;
    }

    public void setY(double yVal) {
        y = yVal;
    }

    public void desloca(double dx, double dy) {
        x = x + dx;
        y = y + dy;
    }

    public void setX(String xVal) {
        
        x = Double.parseDouble(xVal);
    }

    public void setY(String yVal) {
        y = Double.parseDouble(yVal);
    }

    public void desloca(String dx, String dy) {
        x = x + Double.parseDouble(dx);
        y = y + Double.parseDouble(dy);
    }

    public double getX() {
        return (x);
    }

    public double getY() {
        return (y);
    }

    public Ponto() {
        this.x = 1;
        this.y = 1;
    }

    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(Ponto p) {
        this.x = p.x;
        this.y = p.y;
    }

    public String toString() {
        String str = "(" + x + "," + y + ")";
        return str;
    }

}