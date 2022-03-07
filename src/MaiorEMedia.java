import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        int cont = 0;
        int soma = 0;
        int media =0;

        do {
            System.out.println("Digite o Numero");
            num = scan.nextInt();

            soma = soma + num;
            if(num > maior) maior = num;
            cont = cont + 1;

        }while (cont < 5);
        System.out.println("Numero Maior é: " + maior);
        System.out.println("A Soma : "+ soma);
        System.out.println("A Media dos Números: " + soma/5 );
    }
}
