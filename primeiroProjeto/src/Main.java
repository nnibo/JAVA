public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao Screen Match");
        System.out.println("Filme: Top Gun Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        // Exemplo de comentario em JAVA
        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);

        String sinopse = """
                Filme: Top Gun Maverick
                Filme de aventura com galã dos anos 80
                Muito Bom!
                Data de lancamento :
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int notaEmEstrelas = (int) (media / 2);
        System.out.println(notaEmEstrelas);



    }
}