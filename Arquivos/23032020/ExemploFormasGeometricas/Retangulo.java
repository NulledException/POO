
public class Retangulo extends FormaGeometrica {

	private double ladoA, ladoB;
	
	public Retangulo() {
		super("Retângulo");
	}
	
	public Retangulo(String nome) {
		super(nome);
	}

	public double getLadoA() {
		return ladoA;
	}

	public void setLadoA(double ladoA) {
		this.ladoA = ladoA;
	}

	public double getLadoB() {
		return ladoB;
	}

	public void setLadoB(double ladoB) {
		this.ladoB = ladoB;
	}
	
	@Override
	public double getArea() {
		return ladoA * ladoB;
	}
	
}
