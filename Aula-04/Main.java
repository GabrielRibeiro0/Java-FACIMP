public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Civic", 2020, 4);
        Bicicleta bicicleta = new Bicicleta("Caloi", 2018, true);
        Caminhao caminhao = new Caminhao("Volvo", 2015, 18.5);

        System.out.println("=== Carro ===");
        carro.exibirInfo();
        carro.mover();

        System.out.println("\n=== Bicicleta ===");
        bicicleta.exibirInfo();
        bicicleta.mover();

        System.out.println("\n=== Caminhão ===");
        caminhao.exibirInfo();
        caminhao.mover();
    }
}
