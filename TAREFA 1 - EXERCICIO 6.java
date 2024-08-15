package br.edu.fatecpg.exercicio6;

import java.util.Scanner;
public class Exercicio6 {
    public static void main(String[] args) {
        int num, fatorial = 1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num = ler.nextInt();

        for (int i = 1; i <= num; i++) {
            fatorial =  fatorial * i;
        }

        System.out.println("Fatorial de " + num + " = " + fatorial);
    }
}
