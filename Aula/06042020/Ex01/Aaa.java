/**
 * 01
 */
public class Aaa {

        public static void main(String[] args) {
            String nome = "Aliel";
            int count = 0;

            System.out.println(nome.length());            
            System.out.println(nome.toUpperCase());

            if(nome.equalsIgnoreCase("a")){
                count++;
            }else if(nome.equalsIgnoreCase("e")){
                count++;
            }else if(nome.equalsIgnoreCase("i")){
                count++;
            }else if(nome.equalsIgnoreCase("o")){
                count++;
            }else if(nome.equalsIgnoreCase("u")){
                count++;
            }else{}
            
            System.out.println(count);

        }
}