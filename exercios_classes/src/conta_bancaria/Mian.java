package conta_bancaria;

import java.util.Scanner;

public class Mian {

    static final Scanner scanner = new Scanner(System.in);
    static Banco banco;
    public static void main(String[] args) {
        int op;
        do {
            System.out.println("=== Escolha um das Opções===");
            System.out.println("============================");
            System.out.println("1- Abrir Conta");
            System.out.println("2- Saldo");
            System.out.println("3- Depositar");
            System.out.println("4- Sacar");
            System.out.println("5- Pagar Boletos");
            System.out.println("6- Verficar se esta Usando limte so Cheque especial");
            System.out.println("0 - Sair");
            System.out.println("============================");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> createAcount();

                case 2 -> getSaldo();

                case 3 -> depositar();
                
                case 4 -> saque();

                case 5-> pagarBoleto();

                case 6 -> System.out.println(banco.isCheque() ? "Você esta usando o cheque especial" : "");

                case 0 -> System.exit( 0);

                default -> System.out.println("Opção invalita ");
            }

            
        } while (true);
    }

    public static void createAcount() {
        System.out.println("Quando vai ser o seu deposito inicial ");
        double valor = scanner.nextDouble();
        banco = new Banco(valor);
        System.out.println("Conta aberta com sucesso. Você tem um limit especial de R$ "+ banco.getChequeEspecial());
    }

    public static void getSaldo(){
        if(banco != null){
            System.out.println("Seu saldo é R$ "+ banco.getSaldo());
        }
        System.out.println("Conta não existe");
    }

    public static void depositar(){
        if(banco != null){
             System.out.println("Quando quer depositar");
        double valor = scanner.nextDouble();
            banco.deposito(valor);
            System.out.println("Deposito realido com sucesso");
            return;
        }
        System.out.println("Conta não existe");
    }

    public static void saque(){
        if(banco != null){
            System.out.println("Quando vai sacar");
            double valor = scanner.nextDouble();
            banco.saque(valor);
            return;
        }
        System.out.println("Conta não existe");
    }

    public static void pagarBoleto(){
        if(banco != null){
            System.out.println("Qual o valor do boleto a pagar?");
            double valor = scanner.nextDouble();
            banco.pagarBoleto(valor);
            return;
        }
        System.out.println("Conta não existe");
    }
}
