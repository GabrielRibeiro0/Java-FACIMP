public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String modelo, int ano, int numeroPortas) {
        super(modelo, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public void mover() {
        System.out.println("O carro está andando na estrada.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: " + numeroPortas);
    }
}
