package br.edu.fatecpg.exercicio4;
import java.util.Scanner;
public class Exercicio4 {
    public static void main(String[] args) {
        int num, result;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um Número: ");
        num = ler.nextInt();

        System.out.println("Tabuada do " + num);
        for(int i = 1; i <= 10; i++){
            result = num * i;
            System.out.println(num + " X " + i + " = " + result);
        }
    }
}
