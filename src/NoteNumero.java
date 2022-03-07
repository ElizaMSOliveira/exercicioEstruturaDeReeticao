import java.util.Scanner;

public class NoteNumero {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        String nome;
        String senha;

        do {
            System.out.println("Digite seu Nome: ");
            nome = scan.next();
            System.out.println("Digite sua senha");
            senha = scan.next();

            System.out.println("Seu Nome : " + nome);
            System.out.println("Sua Senha : " + senha);


        }while (nome.equals(senha));

    }
}
