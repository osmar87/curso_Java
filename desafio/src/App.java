import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
         String senhaDigitada = sc.nextLine();
        String senhaConfirmada = sc.nextLine();
        
        if(senhaDigitada.equals(senhaConfirmada)){
          System.out.println("Senha valida");
       }else {
          System.out.println("Senhas nao conferem");
       }


        //TODO: Crie a estrutura condicional para verificar se algum dos campos está vazio:

        sc.close();
    }
}