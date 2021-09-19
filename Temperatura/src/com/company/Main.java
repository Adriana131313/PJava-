
package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int temp;
        String mensaje="";
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduzca que temperatura tienes");
        temp=teclado.nextInt();
        if(temp<10){
            mensaje="Hace muhco frio";

        }else{
            if (temp<=35){
                 mensaje= "tiene baja temperatura.. Cuidado!!";
            }else{
                if (temp<=37){
                    mensaje= "Tienes una temperatura normal :D";
                }else{
                    if (temp>=38){
                        mensaje= "Tiene fiebre :( .. Debes ir al médico";
                    }
                }
            }
        }
         System.out.println("La temperatura actual es de:  "+ temp+ "grados");

        System.out.println("\n"+ mensaje);
    }
}
