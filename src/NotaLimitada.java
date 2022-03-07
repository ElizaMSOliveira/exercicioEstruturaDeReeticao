import java.util.Scanner;

public class NotaLimitada {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int nota;

        System.out.println("Digite a nota entre 0 e 10");
        nota = scan.nextInt();
                //True-1-2.....11 12 13....
       while (nota < 0 || nota > 10) {
        System.out.println("A Nota : "+ nota +" Não é Valida!\nDigite Novamente ");
        nota = scan.nextInt();
    }
        System.out.println("Nota Válida! " + "Nota : " + nota);



    }

}
