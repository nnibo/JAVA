import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;

        while (nota != -1) {
            System.out.println("Qual é a nota que voce da para o filme ou -1 pra encerrar");
            nota = leitura.nextDouble();

            if(nota != -1){
            mediaAvaliacao += nota;
            totalNotas++;
            }
        }
        System.out.println("A media é "+mediaAvaliacao/totalNotas);
    }
}
