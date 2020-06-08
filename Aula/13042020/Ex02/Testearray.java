
public class Testearray {
    public Testearray(int tamVet) {
        int array[] = new int[tamVet];
        System.out.println("Tamanho atual do vetor atualizado com sucesso: " + array.length + "\n");
    }

    public Testearray() {
    }

    public void recebeArray(int[] array, int tamArray, int num) {
        for(int i = 0; i < tamArray; i++){
            if(i == 0){
                array[i] = num;
            }else{}
        }
    }

}