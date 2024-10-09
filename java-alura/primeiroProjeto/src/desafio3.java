import java.util.Scanner;

public class desafio3 {
    public static void main(String[] args) {
        //1
        //int numero = 0;
        Scanner leitura = new Scanner(System.in);

        //System.out.println("Digite um numero");
        //numero = leitura.nextInt();
        // if(numero < 0 ){
        //    System.out.println("O numero é negativo");
        //} else if (numero > 0){
        //    System.out.println("O numero é positivo");
        //} else {
        //    System.out.println("O numero é 0");
        //}
        
        //2
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Digite o primeiro numero");
        numero1 = leitura.nextInt();

        System.out.println("Digite o segundo numero");
        numero2 = leitura.nextInt();
        
        if(numero1 == numero2){
            System.out.println("Os numeros são iguais");
        } else if (numero1 != numero2) {
            
        }

    }
}
