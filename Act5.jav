/* Ingresar dos valores que hagan los siguientes operadores
1. Suma
2. Resta
3. Multiplicación
4. Divisón
5. Módulo*
Se deben imprimir de la siguiente manera:
X = {valor primer atributo}
Y = {valor segundo atributo}
Suma: {resultado suma atributos}
Resta: {resultado resta atributos}
Multiplicación: {resultado producto atributos}
División: {resultado división atributos}
Módulo: {resultado módulo atributos} */

package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int x, y, suma, resta, multiplicacion, division, modulo;

            System.out.println("Ingresa el primer número");
              x = Integer.parseInt(leer.nextLine());
            System.out.println("Ingresa el segundo número");
              y= Integer.parseInt(leer.nextLine());

        suma = x + y ;
        resta = x - y;
        multiplicacion = x * y;
        division = x / y;

            System.out.println("X = " + x);
            System.out.println("Y = " + y);
            System.out.println("Suma = " + suma);
            System.out.println("Resta = " + resta);
            System.out.println("Multiplicación = " + multiplicacion);
            System.out.println("División = " + division);
            System.out.println("Módulo = " + x + " y " + y);

        }
    }

