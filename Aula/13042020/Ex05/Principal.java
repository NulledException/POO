import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Automovel[] auto = new Automovel[3];

        for (int i = 0; i < auto.length; i++) {
            auto[i] = new Automovel();

            System.out.println("Digite o nome do carro na posição " + (i + 1));
            auto[i].setNome(in.nextLine());
            System.out.println("Digite a marca do carro na posição " + (i + 1));
            auto[i].setMarca(in.nextLine());
            System.out.println("Digite a cor do carro na posição " + (i + 1));
            auto[i].setCor(in.nextLine());

        }
        for (int i = 0; i < auto.length; i++) {
            if (auto[i].getCor().isEmpty()) {
            } else {
                System.out.println(auto[i]);
            }
        }
        in.close();
    }

}