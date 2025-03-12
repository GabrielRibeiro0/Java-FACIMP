import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Primeiro Número: ");
        int n1 = sc.nextInt();
        sc.nextLine();
        System.out.println("Sinal de operação: (+|-|*|/)");
        String sinal = sc.nextLine();
        System.out.println("Segundo Número: ");
        int n2 = sc.nextInt();

        if (sinal.equals("+") || sinal.equals("mais") || sinal.equals("adição")) {
            int soma = n1 + n2;
            System.out.println("Resultado: " + soma);
        }else if (sinal.equals("-") || sinal.equals("menos") || sinal.equals("subtração")) {
            int soma = n1 - n2;
            System.out.println("Resultado: " + soma);    
        }else if (sinal.equals("*") || sinal.equals("vezes") || sinal.equals("multiplicação")) {
            int soma = n1 * n2;
            System.out.println("Resultado: " + soma);
        }else if (sinal.equals("/") || sinal.equals("por") || sinal.equals("divisão")) {
            int soma = n1 / n2;
            System.out.println("Resultado: " + soma);
        }else {
            System.out.println("Error!");
        }

    }

}
