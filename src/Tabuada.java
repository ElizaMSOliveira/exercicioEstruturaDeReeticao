import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada = 0;
        //int cont;
        int res;

        System.out.println("Qual numero você deseja ver a tabuada");
        tabuada = scan.nextInt();
        System.out.println("Tabuada de: "+tabuada);

        for (int cont = 1; cont <=10; cont++){
            res = tabuada * cont;
            System.out.println(tabuada+" X + " + cont + " = " + res);

        }
    }

}
