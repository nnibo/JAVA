public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("É um filme recente");
        } else {
            System.out.println("é um filme antigo");
        }

        if(incluidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Voce tem acesso a esse filme");
        } else {
            System.out.println("Voce nao tem acesso");
        }

    }
}

