package petshop;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);
    static final PetShop petshop = new PetShop();
    public static void main(String[] args) {
         int op;

        do {
            System.out.println("=== Escolha um das Opções===");
            System.out.println("============================");
            System.out.println("1- dar banho no pet");
            System.out.println("2- abastercer a maquina com agua");
            System.out.println("3- abastercer a maquina com shampoo");
            System.out.println("4- Verificar a agua da maquina");
            System.out.println("5- Verificar 0 shampoo da maquina");
            System.out.println("6- verifica se tem pet no nanhos");
            System.out.println("7- colocar o pet namaquina");
            System.out.println("8- Remover pet do banho");
            System.out.println("9- Limpar maquina");
            System.out.println("0 - Sair");
            System.out.println("============================");

            op = scanner.nextInt();
            scanner.nextLine();
            switch (op) {

                case 1 -> petshop.darBanho();

                case 2 -> extracted();
              
                case 3 ->  extracted2();
               
                case 4 -> getFiricarAqua();
                
                case 5 -> getShampoo();
            
                case 6 -> checkerIsHasPetMachie();

                case 7 -> setPetMachine();

                case 8 -> petshop.removePet();

                case 9 -> petshop.wash();
                    
                   
            }
         
            
        } while ( op != 0 );
        
    }

    private static void extracted2() {
        System.out.println("Tentando colar shampoo na maquina");
        petshop.addShampoo();
    }

    private static void extracted() {
        System.out.println("Tentando colar áqua na maquina");
        petshop.addWater();
    }

    private static void getFiricarAqua() {
        var firicarAqua = petshop.getWater();
        System.out.println("A Maquina esta no momento com " + firicarAqua + " litro(s) de água");
    }

    private static void getShampoo() {
        var shampoo  = petshop.getShampoo();
        System.out.println("A Maquina esta no momento com " + shampoo + " litro(s) de shampoo");
    }

    private static void checkerIsHasPetMachie() {
        var hasPet = petshop.hasPet();
        System.err.println(hasPet ? "Tem pet na maquina": "A maquina esta livre");
    }

    public static void setPetMachine(){
        System.out.println("Infome o nome do pet");
        String nome = scanner.nextLine();
        Pet pet = new Pet(nome);
        petshop.setPet(pet);
    }
}
