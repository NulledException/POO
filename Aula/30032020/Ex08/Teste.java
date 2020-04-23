public class Teste {

    public static void main(String[] args) {

        ConversaoDeUnidadesDeTemperatura Celsius = new ConversaoDeUnidadesDeTemperatura();

        ConversaoDeUnidadesDeTemperatura Fahrenheit = new ConversaoDeUnidadesDeTemperatura();

        ConversaoDeUnidadesDeTemperatura Kelvin = new ConversaoDeUnidadesDeTemperatura();

        ConversaoDeUnidadesDeTemperatura Reaumur = new ConversaoDeUnidadesDeTemperatura();

        ConversaoDeUnidadesDeTemperatura Rankine = new ConversaoDeUnidadesDeTemperatura();

        double temp = 100;

        System.out.println("Celsius To Kevin: " + Celsius.cToK(temp));
        System.out.println("Celsius To Fahrenheit: " + Celsius.cToF(temp));
        System.out.println("Celsius To Reaumur: " + Celsius.cToRe(temp));
        System.out.println("Celsius To Rankine: " + Celsius.cToR(temp));
        
        System.out.println("\nFahrenheit To Kevin: " + Fahrenheit.fToK(temp));
        System.out.println("Fahrenheit To Celsius: " + Fahrenheit.fToC(temp));
        System.out.println("Fahrenheit To Reaumur: " + Fahrenheit.fToRe(temp));
        System.out.println("Fahrenheit To Rankine: " + Fahrenheit.fToR(temp));
        
        System.out.println("\nKelvin To Fahrenheit: " + Kelvin.kToF(temp));
        System.out.println("Kelvin To Celsius: " + Kelvin.kToC(temp));
        System.out.println("Kelvin To Reaumur: " + Kelvin.kToRe(temp));
        System.out.println("Kelvin To Rankine: " + Kelvin.kToR(temp));

        System.out.println("\nReaumur To Fahrenheit: " + Reaumur.reToF(temp));
        System.out.println("Reaumur To Celsius: " + Reaumur.reToC(temp));
        System.out.println("Reaumur To Kelvin: " + Reaumur.reToK(temp));
        System.out.println("Reaumur To Rankine: " + Reaumur.reToR(temp));

        System.out.println("\nRankine To Fahrenheit: " + Rankine.rToF(temp));
        System.out.println("Rankine To Celsius: " + Rankine.rToC(temp));
        System.out.println("Rankine To Kelvin: " + Rankine.rToK(temp));
        System.out.println("Rankine To Reaumur: " + Rankine.rToRe(temp));
    }
}