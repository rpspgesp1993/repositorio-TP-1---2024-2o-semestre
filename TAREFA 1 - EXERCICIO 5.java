package br.edu.fatecpg.exercicio5;
import java.util.Scanner;
public class Exercicio5 {
    public static void main(String[] args) {
        double num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num = ler.nextDouble();

        if(num % 2 == 0){
            System.out.println("Número Par");
        } else {
            System.out.println("Número Ímpar");
        }
    }
}
