public class aula {
    public static void main(String[] args) {
        
        char[] vetor = {'a', 'b', 'c', 'd', 'e'};

        for(int i = 0; i < 10; i++){
            try {
                System.out.println(i + " : " + vetor[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Estorou o limite do vetor");
                System.out.println("na posição " + i);
                break;                
            }
        }
    }

}