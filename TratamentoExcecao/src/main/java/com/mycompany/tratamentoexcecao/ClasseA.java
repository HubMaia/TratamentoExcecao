package com.mycompany.tratamentoexcecao;

public class ClasseA {
    public void metodoA() throws MinhaExcecaoA {
        // Lançando a exceção personalizada
        throw new MinhaExcecaoA("Exceçao A foi gerada pela ClasseA");
    }
}