import java.util.Scanner;

public class projetoFinal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double saldo = 2500.00;

        System.out.println("***********************************");
        System.out.println("Dados iniciais do cliente: ");
        String dadosCliente = """
                Nome:                  Nicolas Baradel
                Tipo Conta:            Corrente
                Saldo inicial:         R$ 2500,00
                """;
        System.out.println(dadosCliente);
        System.out.println("***********************************");

        String operacoes = """
                Operações
                
                1- Consultar saldo
                2- Receber valor
                3- Transferir valor
                4- Sair
                """;
        System.out.println(operacoes);

        System.out.println("Qual operacao voce deseja fazer?");
        int opcao = leitura.nextInt();

        if(opcao == 1){
            System.out.println("Seu saldo é de "+saldo);
        } else if(opcao == 2){
            System.out.println("Qual valor voce deseja receber?");
            double receberValor = leitura.nextDouble();
            double valorNovo = receberValor + saldo;
            System.out.println("Seu saldo agora é de: "+ valorNovo);
        } else if(opcao == 3){
            System.out.println("Qual valor voce deseja transferir?");
            double transferencia = leitura.nextDouble();

            if(saldo > transferencia){
            double valorTransferencia = saldo - transferencia;
            System.out.println("Seu saldo agora é de "+valorTransferencia);
            } else {
                System.out.println("Voce não tem saldo o suficiente");
            }

        }
        else{
            System.out.println("Programa encerrado");
        }



    }
}
