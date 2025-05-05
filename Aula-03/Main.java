public class Main {
    public static void main(String[] args) {
        // Testando EstoqueProduto
        EstoqueProduto produto = new EstoqueProduto();
        produto.setNomeProduto("Chocolate");
        produto.setQuantidade(50);
        produto.setPreco(4.99);

        System.out.println("Produto: " + produto.getNomeProduto());
        System.out.println("Quantidade: " + produto.getQuantidade());
        System.out.println("Preço: R$ " + produto.getPreco());

        // Testando Estudante
        Estudante estudante = new Estudante();
        estudante.setNome("Carlos Gabriel");
        estudante.setIdade(22);
        estudante.setMatricula("20250123");

        System.out.println("\nEstudante: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());

        // Testando Carro
        Carro carro = new Carro();
        carro.setModelo("Civic");
        carro.setMarca("Honda");
        carro.setAno(2020);

        System.out.println("\nCarro: " + carro.getModelo());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Ano: " + carro.getAno());
    }
}
