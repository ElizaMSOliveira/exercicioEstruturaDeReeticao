import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual fatorial deseja?");
        int fatorial = scan.nextInt();
        int numero = 1;


        for(int i = fatorial; i >= 1; i-- ){
            numero = numero * i;

        }
        System.out.println(numero);

    }
}
