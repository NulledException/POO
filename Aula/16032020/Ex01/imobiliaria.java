/**
 * imobiliaria
 */
public class imobiliaria {

    public static void main(final String[] args) {
        final Calculos teste = new Calculos();
        teste.setLargura(100);
        teste.setAltura(200);

        System.out.println("Um terrreno com " + teste.getLargura() + "m de largura e " + teste.getAltura() + "m de altura tem " + teste.getArea() + "m² de area toral."); 
    }
}