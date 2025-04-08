package com.calc;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calculadora calc = new Calculadora(10, 5);
        int resultadoSuma = calc.suma();
        System.out.println( "Hello World!" );
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }
}
