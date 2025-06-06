public class Potencia extends OperacaoMatematica {
    @Override
    public double calcular(double numeroUm, double numeroDois) {
        // Regra: qualquer número elevado a zero é 1
        if (numeroDois == 0) {
            return 1;
        }
        return Math.pow(numeroUm, numeroDois); // Usa o método pow da classe Math
    }
}