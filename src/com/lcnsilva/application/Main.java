package com.lcnsilva.application;

import com.lcnsilva.model.exception.ParametrosInvalidosException;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite o primeiro parametro: ");
            int primeiroParametro = sc.nextInt();
            System.out.println("Digite o segundo parametro: ");
            int segundoParametro = sc.nextInt();
            boolean parametroMaior = verificarParametros(primeiroParametro, segundoParametro);
            if (parametroMaior) {
                for (int i = primeiroParametro+1; i < segundoParametro; i++) {
                    System.out.println("Imprimindo o número " + i);
                }
                break;
            }
        }while(true);
    }

    public static boolean verificarParametros(int primeiro, int segundo){
        try{
            if(primeiro>segundo){
                throw new ParametrosInvalidosException("O segundo parâmetro é maior que o primeiro.");
            }
        }catch(ParametrosInvalidosException e){
            System.out.println("Exceção capturada: " + e.getMessage());
            return false;
        }
        return true;
    }
}
