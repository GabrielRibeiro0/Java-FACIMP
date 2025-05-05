import java.util.Scanner;

public class Atividade2 {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("seu peso: ");
        int peso = sc.nextInt();
        System.out.println("sua altura: ");
        float altura = sc.nextFloat();

        float imc = peso/(altura * altura);

        if (imc <= 18.5) {
            System.out.println("abaixo do peso.");
        }
        else if (imc >= 18.5 && imc <= 24.9 ) {
            System.out.println("peso normal.");
        }
        else if (imc >= 25 && imc <= 29.9) {
            System.out.println("sobrepeso.");
        }
        else if (imc >= 30 && imc <= 34.99) {
            System.out.println("obesidade grau I");
        }
        else if (imc >= 35 && imc <= 39.99) {
            System.out.println("obesidade grau II");
        }
        else if (imc > 40) {
            System.out.println("obeseidade grau III(mórbida)");
        }
    }
}
