package com.mycompany.tratamentoexcecao;

public class ClasseB {
    public void metodoB() throws MinhaExcecaoB {
        // Lançando a exceção personalizada
        throw new MinhaExcecaoB("Exceço B foi gerada pela ClasseB");
    }
}
