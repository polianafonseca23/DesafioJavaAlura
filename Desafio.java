import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = " Rosana Fonseca";
        String tipoConta = " Corrente";
        double saldo = 3590.99;
        int opcao= 0;

        System.out.println("¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");
        System.out.println("\nNome do cliente:"  + nome);
        System.out.println("Tipo da conta:"  + tipoConta);
        System.out.println("Saldo R$: "  + saldo);
        System.out.println("\n¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨¨");

        String menu = """
                ** Digite sua opção: **
                1 - Consultar saldo disponível:
                2 - Transferência de valor:
                3 - Receber valor:
                4 - Sair
                
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao !=4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atualizado " + saldo);
            } else if (opcao == 2) {
                System.out.println("Qual o valor será transferido?");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Saldo atualizado " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: " );
                double valor = leitura.nextDouble();
                saldo+= valor;
                System.out.println("Saldo atualizado " + saldo);

            } else if (opcao != 4) {
                System.out.println("Opcão inválida");

            }


        }
    }
}


