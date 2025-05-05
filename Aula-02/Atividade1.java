package Aula-02;

import java.util.Locale;
import java.util.Scanner;

class Funcionario {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public Funcionario(String nome, double salarioBruto, double imposto) {
        this.nome = nome;
        this.salarioBruto = salarioBruto;
        this.imposto = imposto;
    }

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalario(double percentual) {
        salarioBruto += salarioBruto * (percentual / 100);
    }

    @Override
    public String toString() {
        return "Funcionário: " + nome + ", R$ " + String.format("%.2f", salarioLiquido());
    }
}

public class Atividade1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();
        
        System.out.print("Salário bruto: ");
        double salarioBruto = sc.nextDouble();
        
        System.out.print("Imposto: ");
        double imposto = sc.nextDouble();

        Funcionario funcionario = new Funcionario(nome, salarioBruto, imposto);
        
        System.out.println("\n" + funcionario);
        
        System.out.print("\nQual a porcentagem de aumento do salário? ");
        double percentual = sc.nextDouble();
        
        funcionario.aumentarSalario(percentual);
        
        System.out.println("\nDados atualizados: " + funcionario);
        
        sc.close();
    }
}
