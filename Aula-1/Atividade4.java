import java.util.Scanner;

public class Atividade4 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Primeira nota: ");
        float n1 = sc.nextFloat();
        System.out.println("Segunda nota: ");
        float n2 = sc.nextFloat();
        System.out.println("Terceira nota: ");
        float n3 = sc.nextFloat();

        float media = (n1 + n2 + n3) / 3;
        System.out.println(media);
    }

}
