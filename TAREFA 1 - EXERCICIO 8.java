package br.edu.fatecpg.exercicio8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        int fatorial, num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um Número: ");
        num = scanner.nextInt();

        fatorial = (int) Math.pow(num, 2);

        System.out.println("Soma dos primeiros " + num + " números ímpares: " + fatorial);
        scanner.close();
    }
}