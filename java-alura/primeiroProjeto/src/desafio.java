public class desafio {
    public static void main(String[] args) {
        double media = (8.7 + 2.6) / 2;
        System.out.println(media);

        double numero = 2.3;
        int casting = (int) (numero);
        System.out.println(casting);

        char letra = 'A';
        String frase = "Minha comida favorita é ";
        System.out.println(letra + frase);

        double precoProduto = 10.99;
        int quantidade = 5;
        System.out.println("O valor total é de " + precoProduto * quantidade);

        double valorEmDolares = 22.5;
        double reais = valorEmDolares * 4.94;
        System.out.println(reais);

        double precoOriginal = 5.0;
        double percentualDesconto = 50.0;
        double valorDesconto = (percentualDesconto / 100) * precoOriginal;
        double novoPreco = precoOriginal - valorDesconto;

        System.out.println("O preco era de " + precoOriginal);
        System.out.println("Desconto de "+ valorDesconto);
        System.out.println("preco novo de " + novoPreco);
    }
}
