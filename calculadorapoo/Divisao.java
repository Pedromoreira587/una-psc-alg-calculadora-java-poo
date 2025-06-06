public class Divisao extends OperacaoMatematica {
    @Override
    public double calcular(double numeroUm, double numeroDois) {
        // Regra para divisão por zero
        if (numeroDois == 0) {
            System.out.println("Impossível realizar uma divisão por zero.");
            return Double.NaN; // Retorna Not a Number para indicar um resultado inválido
        }
        return numeroUm / numeroDois;
    }
}