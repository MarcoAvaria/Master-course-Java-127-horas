package cl.mavaria.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador:");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador:");

        try {
            double division2 = cal.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);
        } catch (NumberFormatException nfe){
            System.out.println("Se detecto una excepción: por favor ingrese un valor numérico: " + nfe.getMessage());
            main(args);
        } catch (FormatoNumeroException e){
            System.out.println("Se dectecto una excepción, ingrese un número válido: " + e.getMessage());
            e.printStackTrace(System.out);
        }
        catch (DivisionPorZeroException ae){
            System.out.println("Capturamos la excepción en tiempo de ejecución: " + ae.getMessage());
            main(args);
        } finally {
            System.out.println("Es opcional pero se ejecuta siempre con o sin excepción");
        }
        System.out.println("Continuamos con el flujo de nuestra aplicación!");
    }
}
