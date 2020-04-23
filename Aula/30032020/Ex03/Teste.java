public class Teste {
    public static void main(String[] args) {
        double a = 1;
        int b = 2;
        double c = 3;
        int d = 4;

        Matematica foo = new Matematica();

        System.out.println("a = 1\nb = 2\nc = 3\nd = 4\nSoma : ");

        System.out.println("(d, c) int + double : " + foo.soma(d, c));

        System.out.println("(c, d) double + int : " + foo.soma(c, d));

        System.out.println("(d, b) int + int : " + foo.soma(d, b));

        System.out.println("(a, c) double + double : " + foo.soma(a, c));

        Matematica foo2 = new Matematica();

        System.out.println("Subtração : ");

        System.out.println("(d, c) int - double : " + foo2.sub(d, c));

        System.out.println("(c, d) double - int : " + foo2.sub(c, d));

        System.out.println("(d, b) int - int : " + foo2.sub(d, b));

        System.out.println("(a, c) double - double : " + foo2.sub(a, c));
    }
}