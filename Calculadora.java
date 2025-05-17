/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Calculadora Simples");
        System.out.println("Escolha a operação:");
        System.out.println("1 = Soma");
        System.out.println("2 = Subtração");
        System.out.println("3 = Multiplicação");
        System.out.println("4 = Divisão");
        System.out.print("Digite sua opção (1-4): ");
        
        int operacao = scanner.nextInt();
        
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        
        double resultado = 0;
        boolean operacaoValida = true;
        
        switch (operacao) {
            case 1:
                resultado = num1 + num2;
                System.out.println("Resultado da soma: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("Resultado da subtração: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("Resultado da multiplicação: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado da divisão: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero não é permitida!");
                }
                break;
            default:
                System.out.println("Operação inválida! Por favor, escolha um número entre 1 e 4.");
                operacaoValida = false;
        }
        
        scanner.close();
    }
}

    
        
    

