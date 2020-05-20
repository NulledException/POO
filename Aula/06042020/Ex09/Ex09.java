import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int numero;
        int decimal;
        int unidade;
        String extenso = "";
        Scanner in = new Scanner(System.in);

        for (numero = 0; numero < 20 || numero > 99;) {
            System.out.println("Digite um numero entre 20 e 99: ");
            numero = in.nextInt();
        }
        
        in.close();

        decimal = numero / 10;
        if(decimal == 2){
            extenso = "vinte";
        }else if(decimal == 3){
            extenso = "trinta";
        }else if(decimal == 4){
            extenso = "quarenta";
        }else if(decimal == 5){
            extenso = "cinquenta";
        }else if(decimal == 6){
            extenso = "sessenta";
        }else if(decimal == 7){
            extenso = "setenta";
        }else if(decimal == 8){
            extenso = "oitenta";
        }else if(decimal == 9){
            extenso = "noventa";
        }else{}

        unidade = numero - (decimal * 10);
        if (unidade == 1){
            extenso = extenso + " e um";
        }else if (unidade == 2){
            extenso = extenso + " e dois";
        }else if (unidade == 3){
            extenso = extenso + " e tres";
        }else if (unidade == 4){
            extenso = extenso + " e quatro";
        }else if (unidade == 5){
            extenso = extenso + " e cinco";
        }else if (unidade == 6){
            extenso = extenso + " e seis";
        }else if (unidade == 7){
            extenso = extenso + " e sete";
        }else if (unidade == 8){
            extenso = extenso + " e oito";
        }else if (unidade == 9){
            extenso = extenso + " e nove";
        }{}

        System.out.println(extenso);

    }
}