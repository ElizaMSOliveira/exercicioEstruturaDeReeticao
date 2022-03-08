import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String[] consoantes = new String[6];
        int quatidadeConsoantes = 0;

        int count = 0;
        do {
            System.out.println("Digite a letra");
            String letra = scan.next();

            if (  !(letra.equalsIgnoreCase("a") ||
                    letra.equalsIgnoreCase("e") ||
                    letra.equalsIgnoreCase("i") ||
                    letra.equalsIgnoreCase("o") ||
                    letra.equalsIgnoreCase("u")) ){
                consoantes[count] = letra;
                quatidadeConsoantes++;

            }
                 count++;

        }while (count < consoantes.length);
        //System.out.println(consoantes[count]);
//Lado esquerdo tipo criado na hora, lado direito o arraysque quero navegar
        // para cada elemento dentro desse array de eu quero que leia esse elemento
        for ( String consoante : consoantes  ) {
// a cada laço ler a consoante que ta no array
            if (consoante !=null){
                System.out.print(consoante + " ");
            }

        }
        System.out.println("\nQuantidade de Consoantes: "+quatidadeConsoantes );
    }
}
