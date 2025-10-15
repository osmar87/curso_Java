import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Banco;
import model.User;

public class App {
    static Scanner sc = new Scanner(System.in);
    static Banco bancoSelecionado = null;
    static double valor;
    static List<Banco> banco = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        
        int openConta;

        do {
            System.out.println("1 - Abrir nova conta");
            System.out.println("2 - Ver Saldo");
            System.out.println("3 - Fazer um deposito");
            System.out.println("4 - Fazer um saque");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");
            openConta = sc.nextInt();
            sc.nextLine(); // <<-- consome o \n deixado pelo nextInt1

            switch (openConta) {
                case 1:
                    User user = cadastroUser();
                    Banco newBanco = new Banco("ContaCorrente", user, 100);
                    System.err.println(newBanco.extrado());
                    banco.add(newBanco);
                    System.out.printf("Conta aberta Com sucesso. O numero da conta é %s \n", newBanco.getNUCONTA());
                    break;
                case 2:
                    
                    bancoSelecionado = buscaConta(banco);

                    if(bancoSelecionado != null){
                        System.out.printf("Seu saldo é %s \n",bancoSelecionado.getSaldo());
                    }else{
                         System.out.println("Conta não encontrada!");
                    }

                    break;
                case 3:
                     Banco bancoSelecionado = buscaConta(banco);
                     System.out.println("Informe o valor a depositar? ");
                     valor = sc.nextDouble();

                    

                    if(bancoSelecionado != null){
                         bancoSelecionado.depositar(valor);
                        System.out.printf("Seu saldo é %s \n",bancoSelecionado.getSaldo());
                    }else{
                         System.out.println("Conta não encontrada!");
                    }

                    break;

                case 4:
                    bancoSelecionado = buscaConta(banco);
                    System.out.println("Informe o valor a sacar? ");
                    valor = sc.nextDouble();


                    if(bancoSelecionado != null){
                         bancoSelecionado.saque(valor);
                        System.out.printf("Seu saldo é %s \n",bancoSelecionado.getSaldo());
                    }else{
                         System.out.println("Conta não encontrada!");
                    }
                    
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (openConta != 0);
        
       sc.close();
    }


    public static User cadastroUser(){
        System.out.println("Infome seu nome");
        String nome = sc.nextLine();
        System.out.println("Infome seu CPF");
        String cpf = sc.nextLine();
        System.out.println("Infome seu Ano de Nascimento");
        String nasc = sc.nextLine();
        System.out.println("Infome seu email");
        String email= sc.nextLine();
        System.out.println("Infome uma senha");
        String passworld = sc.nextLine();

        User user = new User(nome, cpf, nasc, email, passworld);
         return user;
    }
    public static Banco buscaConta(List<Banco> banco){
        Banco contaSelecionada = null;
        System.out.print("Digite o número da conta: ");
        int numConta = sc.nextInt(); // usuário digita o número da conta

        for (Banco b : banco) {
            if(b.getNUCONTA()== numConta){
                contaSelecionada = b;
                break;
            }
        }
        return contaSelecionada;
    }

}
