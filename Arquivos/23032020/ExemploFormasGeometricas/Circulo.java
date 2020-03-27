
public class Circulo extends FormaGeometrica {

	private double raio;
	
	public Circulo() {
		super("Círculo");
	}

	public Circulo(String nome) {
		super(nome);
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double getArea() {
		return Math.PI * raio * raio;
	}

}
