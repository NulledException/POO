package Ex02;

public class Teste {
    public static void main(String[] args) {
        
        Ingresso i1 = new Ingresso ();

        i1.setValor(20.20);

        System.out.println(i1);

        VIP v1 = new VIP();

        v1.setValor(20.20);

        System.out.println("VIP: " + v1);

        Normal n1 = new Normal();

        n1.setValor(20.20);

        System.out.println("Normal: " + n1.imprimeValor());

        CamaroteInferior ci1 = new CamaroteInferior();

        ci1.setValor(20.20);
        ci1.setLocalizacao("Loc[0]");

        System.out.println("Camarote Inferior: " + ci1 + " Localizacao: " + ci1.getLocalizacao());

        CamaroteSuperior cs1 = new CamaroteSuperior();

        cs1.setValor(20.20);
        cs1.setLocalizacao("Loc[1]");

        System.out.println("Camarote Superior: " + cs1 + " Localizacao: " + cs1.getLocalizacao());
    }
}