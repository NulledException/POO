import java.util.Scanner;

public class Primos {
    public boolean ehPrimo (int n){
        
        int divisores, i;
        
        divisores = 0;
        
        for(i=1; i<=n; i++){
            divisores++;
        }
        return divisores==2;
    }
    public static void main (String[] args) {
        int numero;
        Primos p = new Primos();
    
        Scanner in = new Scanner(System.in);
        System.out.print("Informe um numero: ");
        numero = in.nextInt();
    
        if(p.ehPrimo(numero)) {
            System.out.println(numero + " é primo !");
        } else {
            System.out.println(numero + " NAO é primo");
        }
        
        in.close();
    }
}
