public class Produto {

    
    String nome;
    String marca; 
    double custo;
    double venda;

    
    public Produto(String nome, String marca, double custo, double venda) {
        this.nome = nome;
        this.marca = marca;
        this.custo = custo;
        this.venda = venda;
    }

    // Método que calcula o lucro
    public double calcularLucro() {
        return venda - custo; // Lucro = Preço de Venda - Preço de Custo
    }

   
    public static void main(String[] args) {
        // Criando objetos da classe Produto
        Produto produto1 = new Produto("notebook", "dell", 1000.0, 2500.0);
        Produto produto2 = new Produto("teclado", "logitech", 200.0, 550.0);

        // Exibindo os atributos e o lucro do primeiro produto
        System.out.println("Produto 1:");
        System.out.println("Nome: " + produto1.nome);
        System.out.println("Marca: " + produto1.marca);
        System.out.println("Preço de Custo: R$" + produto1.custo);
        System.out.println("Preço de Venda: R$" + produto1.venda);
        System.out.println("Lucro: R$" + produto1.calcularLucro()); 

        // Exibindo os atributos e o lucro do segundo produto
        System.out.println("\nProduto 2:");
        System.out.println("Nome: " + produto2.nome);
        System.out.println("Marca: " + produto2.marca);
        System.out.println("Preço de Custo: R$" + produto2.custo);
        System.out.println("Preço de Venda: R$" + produto2.venda);
        System.out.println("Lucro: R$" + produto2.calcularLucro()); 
    }
}
