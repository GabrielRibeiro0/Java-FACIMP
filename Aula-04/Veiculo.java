public class Veiculo {
    protected String modelo;
    protected int ano;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
    }

    public void mover() {
        System.out.println("O veículo está se movendo.");
    }
}
