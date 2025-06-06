// Adicao.java
public class Adicao extends OperacaoMatematica {
    @Override // subscreve um método da classe pai
    public double calcular(double n1, double n2) {
        return n1 + n2;
    }
}