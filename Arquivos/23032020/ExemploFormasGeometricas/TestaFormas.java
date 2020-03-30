
public class TestaFormas {

	public static void main(String[] args) {
		
		FormaGeometrica f = new FormaGeometrica();
		
		System.out.println(f);
		Retangulo r = new Retangulo();
		r.setLadoA(3);
		r.setLadoB(4);
		
		System.out.println(r);
		
		Triangulo t = new Triangulo();
		t.setLadoA(3);
		t.setLadoB(4);
		t.setLadoC(5);
		
		System.out.println(t);
		
		Circulo c = new Circulo();
		c.setRaio(2);
		
		System.out.println(c);
		
		Quadrado q = new Quadrado();
		
		q.setLadoA(2);
		
		System.out.println("Lado a = 2 : " + q);
		
		q.setLadoB(3);
		
		System.out.println("Lado a = 3 : " + q);
	}
	
}
