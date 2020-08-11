import java.util.Scanner;

public class ProjetoJava01 {
    Integer idade = 0;
    String  nome;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Seja bem vindo ao primeiro programa");
        System.out.println("Digite o nome do usuario");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do usuario");
        Integer idade = Integer.parseInt(sc.nextLine());

        if (idade > 18){
            System.out.println("Nome:  " +nome + " é maior de idade" );

        }
        else{
            System.out.println("Não é maior de idade");
        }


    }

}
