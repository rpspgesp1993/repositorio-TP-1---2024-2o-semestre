package br.edu.fatecpg.exerc1;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num = ler.nextDouble();
        if(num > 0){
            System.out.println("Número Positivo");
        } else if (num < 0) {
            System.out.println("Número Negativo");
        } else {
            System.out.println("Nulo");
        }
    }
}