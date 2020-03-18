public class Contador {
    
    private int qntd;
    private int soma;
    
    public Contador(){
        
        qntd = 0;
        soma = 0;
    }
    public void contaUm(int numero){

        qntd++;
        soma += numero;
    }
    public int temQuantos(){

        return qntd;
    }
    public void zerar(){

        qntd = 0;
        soma = 0;
    }
    public float media(){
        if(qntd == 0){
            return 0;
        }   

        return soma / qntd;
    }
};