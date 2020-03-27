
public class FormaGeometrica {
	
	private String nome;
	
	public FormaGeometrica() {
		this.nome = "Indefinida";
	}

	public FormaGeometrica(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getArea() {
		return 0;
	}
	
	public String toString() {
		return nome + " : área = " + getArea();
	}

}
