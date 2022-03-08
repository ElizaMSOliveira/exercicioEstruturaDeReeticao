public class OrdemInversa {
    public static void main(String[] args) {
        //Arrays começa na posição 0
        //devem ser do mesmo tipo
        //os elementos são colocados na ordem que são inseridos
        int[] vetor = {0,-5,15,50,8,4};

        System.out.println("Vetor Normal; ");
       int count = 0;
        while (count < (vetor.length)) {
            System.out.print(vetor[count]+ " ");
            count++;
        }
        System.out.println("\nVetor Inverso: ");
        for (int i = (vetor.length-1);i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
