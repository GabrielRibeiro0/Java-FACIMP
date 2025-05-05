public class Bicicleta extends Veiculo {
    private boolean temMarcha;

    public Bicicleta(String modelo, int ano, boolean temMarcha) {
        super(modelo, ano);
        this.temMarcha = temMarcha;
    }

    @Override
    public void mover() {
        System.out.println("A bicicleta está sendo pedalada.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tem marcha: " + (temMarcha ? "Sim" : "Não"));
    }
}
