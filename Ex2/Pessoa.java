public class Pessoa {
    public String nome;
    public double altura;
    public String dataNascimento;
    public String email;

    public Pessoa (String nome, double altura, String dataNascimento) {

        this.nome = nome;           //construtor da classe
        this.altura = altura;
        this.dataNascimento = dataNascimento;
       

        String dataAtual = "2024-09-17";            ///Verifica se a data de nascimento é posterior à data atual
        if (dataNascimento.compareTo(dataAtual) > 0) {
            System.out.println("A data de nascimento não pode ser posterior à data atual. ");

        }

        this.email = gerarEmail();    //gerar email chamando o metodo gerarEmail


    }
    private String gerarEmail() {         //método para gerar o email
        return nome + "@dominio.com";
    }
    

    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João Silva", 1.75, "1990-05-23");    // Criando uma pessoa e acessando diretamente os atributos
        System.out.println("Nome: " + pessoa.nome);
        System.out.println("Altura: " + pessoa.altura);
        System.out.println("Data de Nascimento: " + pessoa.dataNascimento);
        System.out.println("Email: " + pessoa.email);
    }
	
}
