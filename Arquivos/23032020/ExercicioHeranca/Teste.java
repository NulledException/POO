
public class Teste {

	public static void main(String[] args) {
		
		
		Animal a = new Animal();
		
		System.out.println(a.getNome());
		System.out.println(a.getRaca());
		System.out.println(a.caminha());
		
		a.setNome("Cavalo");
		
		System.out.println(a.getNome());
		System.out.println(a.getRaca());
		System.out.println(a.caminha());
		
		Cachorro c = new Cachorro();
		c.setNome("Totó");
		c.setRaca("PitBull");
		
		System.out.println(c.getNome());
		System.out.println(c.getRaca());
		System.out.println(c.caminha());
		System.out.println(c.late());
			
		

	}

}
