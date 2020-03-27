
public class Triangulo extends Retangulo {

	private double ladoC;

	public Triangulo() {
		super("Triângulo");
	}

	public double getLadoC() {
		return ladoC;
	}

	public void setLadoC(double ladoC) {
		this.ladoC = ladoC;
	}

	private double getSemiPerimetro() {

		double perimetro = this.getLadoA() + this.getLadoB() + this.getLadoC();
		return perimetro / 2;

	}

	@Override
	public double getArea() {

		double s = this.getSemiPerimetro();

		double area = Math.sqrt(s * (s - this.getLadoA()) * (s - this.getLadoB()) * (s - this.getLadoC()));

		return area;
	}

}
