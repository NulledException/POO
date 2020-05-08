public class TestaPonto {
    public static void main(String args[]) {

        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(2, 2);
        Ponto p3 = new Ponto(p1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.setX("3");
        p1.setY("3");
        System.out.println("\n" + p1);

        p1.desloca("1", "1");
        System.out.println("\n" + p1);
    }
}