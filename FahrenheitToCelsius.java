import java.util.Scanner;

public class FahrenheitToCelsius {

    public float converterParaCelsius(float temperaturaEmFahrenheit) {
        return (temperaturaEmFahrenheit - 32) * 5/9 ;
    }

    public static void main(String[] args){
        FahrenheitToCelsius conversor = new FahrenheitToCelsius();
        float resultadoEmCelsius = conversor.converterParaCelsius(5);
        System.out.print("Temperatura: " + resultadoEmCelsius + " Celsius");
    }
}