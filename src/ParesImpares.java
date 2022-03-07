import java.util.Scanner;

public class ParesImpares {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntNum;
        int num;
        int par = 0;
        int impa= 0;

        System.out.println("Quantos Números Você quer?");
        qntNum = scan.nextInt();

        int cont =0;
        do {
            System.out.println("Digite o Número : ");
            num = scan.nextInt();

            if(num % 2 == 0) par++;
            else impa++;

            cont++;
        }while (cont < qntNum);
        System.out.println("Quantidade de Impares: " + impa);
        System.out.println("Quantidade de Pares: " + par);
    }
}
