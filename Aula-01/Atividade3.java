import java.util.Scanner;

public class Atividade3 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Valor pego emprestado: ");
        double valorEmprestado = sc.nextDouble();
        System.out.println("Quantidade de meses: ");
        int meses = sc.nextInt();
        System.out.println("taxa dos juros(em porcentagem): ");
        double taxa = sc.nextFloat();

        double juros = (valorEmprestado * taxa * meses) / 100;

        System.out.println(juros);
    }
}
