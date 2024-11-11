public class ConversionTemperaturas {
    public static void main(String[] args) throws Exception {

        System.out.println("TABLA DE CONVERSION DE TEMPERATURAS");
        System.out.println("-----------------------------------");
        
        System.out.println("Celsius\t\t\tFarenheit");

        for (double celsius = -50.00; celsius <= 50.00; celsius += 10) {
            
            System.out.printf("%6.2fC", celsius);
            System.out.printf("%24.2fF\n", convertirCelsiusFarenheit(celsius));
        }

        System.out.println("-----------------------------------");

    }

    public static double convertirCelsiusFarenheit(double celsius) {
        // Pre: la temperatura celsius minima es -273.15°C
        if (celsius < -273.15) {
            throw new IllegalArgumentException("Temperatura demasiado baja");
        }
        return (celsius * (9.0 / 5.0)) + 32;
    }

}
