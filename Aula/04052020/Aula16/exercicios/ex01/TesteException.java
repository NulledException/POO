package Aula16.exercicios.ex01;

public class TesteException {
    public static void main(String[] args) {
        System.out.println("inicio main");
        metodo1();
        System.out.println("fim main");
    }
    static void metodo1(){
        System.out.println("inicio metodo1");
        metodo2();
        System.out.println("fim metodo1");
    }
    static void metodo2(){
        System.out.println("inicio metodo2");
        int[] array = new int[10];
        try {
            for(int i = 0; i <= 15; i++){
                array[i] = i;
                System.out.println(i);
            }
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Estorou o vetor");
        }
        
        System.out.println("fim metodo2");
    }
}