// RaizQuadrada.java
public class RaizQuadrada extends OperacaoMatematica {
    @Override
    public double calcular(double n1, double n2) {
        // Para a raiz quadrada, o segundo número não é usado neste método.
        // Chamamos o método sobrecarregado que aceita apenas um parâmetro.
        return calcular(n1);
    }

    @Override
    public double calcular(double n1) {
        if (n1 < 0) {
            System.out.println("Não existe raiz de número negativo.");
            return Double.NaN; // Retorna Not a Number para indicar erro
        }
        return Math.sqrt(n1);
    }
}
