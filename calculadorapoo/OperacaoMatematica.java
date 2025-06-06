public abstract class OperacaoMatematica {
    // método abstrato e implementado por cada operação específica.
    // Ele assume que a maioria das operações precisa de dois números.
    public abstract double calcular(double n1 , double n2);

    // Para operações que só precisam de um número,
    public double calcular(double n1) {
        throw new UnsupportedOperationException("Esta operação requer dois parâmetros ou não está implementada para um único parâmetro.");
    }
    
}
