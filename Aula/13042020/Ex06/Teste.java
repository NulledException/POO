public class Teste {
    public static void main(String[] args) {
		
		Contato jose = new Contato("José", "jose@gmail.com"); //crio o meu contato
		Contato joao = new Contato("João", "joao@hotmail.com");
		
		Agenda contatos = new Agenda(10); //crio minha agenda com um suporte para no máximo 10 contatos

		contatos.adicionarContato(joao); //adiciono o João
		contatos.adicionarContato(jose); //adiciono o contato criado anteriormente
		
		System.out.println("O contato José existe? " + contatos.buscarContato("José")); //busco se ele existe, nesse caso imprime true, pois eu acabei de adicionar ele
		
		contatos.removerContato(jose); //removo o contato criado anteriormente
		System.out.println("O contato João existe? " + contatos.buscarContato("João"));
		System.out.println("O contato José existe? " + contatos.buscarContato("José")); //busco novamente pelo José, aqui imprime false, pois eu acabei de removê-lo
		
	}
}