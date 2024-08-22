import java.util.Scanner;
import java.util.Random;

public class desafio2 {
    public static void main(String[] args) {
        int tentativas = 0;
        int numero = new Random().nextInt(100);
        int chute = 0;
        Scanner leitura = new Scanner(System.in);


        while(tentativas < 5){
            System.out.println("Digite seu chute");
            chute = leitura.nextInt();
            tentativas++;

            if (chute == numero){
                System.out.println("Parabens, voce ganhou em " + tentativas);
                break;
            }
            else if(chute > numero){
                System.out.println("O numero gerado é menor");
            }
            else{
                System.out.println("O numero gerado é maior");
            }
        }

        if(tentativas == 5 && chute != numero){
            System.out.println("Que pena voce perdeu, o numero era " + numero);
        }


    }
}
