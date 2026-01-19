package util;

public class CurrencyConverter {
    
    public static final int IOF = 6;

    public static double reais(double cotacao, double  dolar){
        double real = dolar * cotacao;
        return real + ((real / 100) * IOF);
    }
}
