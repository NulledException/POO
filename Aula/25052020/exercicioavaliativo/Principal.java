package exercicioavaliativo;

public class Principal {
    public static void main(String[] args) {
        Forca forca = new Forca();
        Player usuario = new Player();

        ArrayList<Player> jogadores = new ArrayList<Player>();

        System.out.print("Nome do usuario:");
			String nome = sc.next();
			usuario.setNome(nome);
        forca.novoJogo();
        forca.jogar();
    }
}