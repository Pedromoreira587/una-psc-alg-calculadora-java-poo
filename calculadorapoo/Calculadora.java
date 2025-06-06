import java.util.InputMismatchException; // tratamento de erros de entrada
import java.util.Scanner;

public class Calculadora { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String opcao = "";

        System.out.println("----- Calculadora Java - POO -----");

        while (!opcao.equalsIgnoreCase("Q")) { // Loop continua até o usuário digitar 'Q'
            System.out.println("\nEscolha a operação:");
            System.out.println("+ Adição");
            System.out.println("- Subtração");
            System.out.println("* Multiplicação");
            System.out.println("/ Divisão");
            System.out.println("^ Potência");
            System.out.println("R Raiz Quadrada");
            System.out.println("Q Sair");
            System.out.print("Sua opção: ");
            opcao = sc.next();

            if (opcao.equalsIgnoreCase("Q")) {
                System.out.println("Saindo da calculadora. Até mais!");
                break; 
            }

            double n1 = 0;
            double n2 = 0;

            
            try {
                System.out.print("Informe o primeiro número: ");
                n1 = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número.");
                sc.next(); 
                continue; 
            }

            
            if (!opcao.equalsIgnoreCase("R")) {
                try {
                    System.out.print("Informe o segundo número: ");
                    n2 = sc.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, digite um número.");
                    sc.next(); 
                    continue; 
                }
            }

            
            OperacaoMatematica operacao = null;
            double resultado = Double.NaN; 

            switch (opcao) {
                case "+":
                    operacao = new Adicao();
                    resultado = operacao.calcular(n1, n2);
                    break;
                case "-":
                    operacao = new Subtracao();
                    resultado = operacao.calcular(n1, n2);
                    break;
                case "*":
                    operacao = new Multiplicacao();
                    resultado = operacao.calcular(n1, n2);
                    break;
                case "/":
                    operacao = new Divisao();
                    resultado = operacao.calcular(n1, n2);
                    break;
                case "^":
                    operacao = new Potencia();
                    resultado = operacao.calcular(n1, n2);
                    break;
                case "R":
                case "r":
                    operacao = new RaizQuadrada();
                    resultado = operacao.calcular(n1); // Chama o método sobrecarregado para um número
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma operação válida.");
                    continue; // Volta para o início do loop
            }

            // Só imprime o resultado se não for um erro (NaN)
            if (!Double.isNaN(resultado)) {
                System.out.println("Resultado: " + resultado);
            }
        }
        sc.close();
    }
}