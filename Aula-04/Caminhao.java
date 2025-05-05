public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String modelo, int ano, double capacidadeCarga) {
        super(modelo, ano);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando carga.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: " + capacidadeCarga + " toneladas");
    }
}
