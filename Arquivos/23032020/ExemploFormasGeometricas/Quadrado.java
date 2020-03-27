
public class Quadrado extends Retangulo {
	
	public Quadrado() {
		super("Quadrado");
	}
	
	public Quadrado(String nome) {
		super(nome);
	}

	public double getLadoB() {
		return this.getLadoA();
	}

	public void setLadoB(double ladoB) {
		super.setLadoA(ladoB);
	}
	
	@Override
	public double getArea() {
		return getLadoA() * getLadoA();
	}
	
}
