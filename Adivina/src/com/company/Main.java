package com.company;
import java.util.Random;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        int acertar = r.nextInt(100); // genera un número entre 0 y 99
        int i = 1; // crea variable contador que es usada para contar los intentos fallidos
        int apuesta = input("Adivina que número puede ser de 1 a 100 .. ¿ Que número crees que pueda ser?");
        while (acertar != apuesta) { // si el número dado es distinto al sorteado repite
            i++; // incrementa variable contador
            if (acertar > apuesta) {
                apuesta = input("El número a adivinar es mayor. \n Prueba otra vez");
            } else {
                apuesta = input("El número a adivinar es menor. \n Prueba otra vez");
            }
        }
        JOptionPane.showMessageDialog(null,
                "Enhorabuena :), ha dado con el número correcto con " + i + " estos son la cantidad de  intentos equivocado que tuviste :/");
    }

    private static int input(String text) {
        return Integer.parseInt(JOptionPane.showInputDialog(text));
    }

    // falto saber controlar que solo se puedan añadir números

}
