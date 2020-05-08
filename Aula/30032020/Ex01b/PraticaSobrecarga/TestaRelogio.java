public class TestaRelogio {

    public static void main(String[] args) {
        Relogio r1 = new Relogio(10, 10, 10);
        Relogio r2 = new Relogio(10, 10);
        Relogio r3 = new Relogio(10);

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }

}