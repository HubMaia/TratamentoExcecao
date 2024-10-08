package com.mycompany.tratamentoexcecao;

public class TratamentoExcecao {
    public static void main(String[] args) {
        ClasseA objetoA = new ClasseA();
        ClasseB objetoB = new ClasseB();

        // Bloco try-catch para a exceção da ClasseA
        try {
            objetoA.metodoA();
        } catch (MinhaExcecaoA e) {
            System.out.println("Peguei uma excecaoo da ClasseA: " + e.getMessage());
        }

        // Bloco try-catch para a exceção da ClasseB
        try {
            objetoB.metodoB();
        } catch (MinhaExcecaoB e) {
            System.out.println("Peguei uma exceçao da ClasseB: " + e.getMessage());
        }
    }
}
