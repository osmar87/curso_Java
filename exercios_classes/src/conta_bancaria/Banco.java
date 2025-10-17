package conta_bancaria;

import java.util.Random;

public class Banco {
    private long numConta;
    private double saldo;
    private double chequeEspecial;
    
    public Banco(double saldo) {
        this.numConta = 1000 + new Random().nextInt(9999);
        this.saldo = saldo;
        this.setChequeEspecial(saldo);

    }

    public long getNumConta() {
        return numConta;
    }
   
    public double getSaldo() {
        return saldo;
    }
    public void deposito(double saldo) {
        if(saldo !=0){
            this.saldo += saldo;
            return;
        }
        System.out.println("Deposito invalido ");

    }

    public void saque(double valor) {
        if (this.saldo >= valor){
            this.saldo -= valor;
              System.out.println("Saque realizado com sucesso!");
        }
        else if((this.saldo + this.chequeEspecial) >= valor){
            double restante = valor - this.saldo;
            this.saldo = 0;
            this.chequeEspecial -= restante;
            
            // aplica taxa de 20% sobre o valor usado
            double taxa = (restante * 0.2) + restante;
            this.saldo -= taxa; // saldo pode ficar negativo

            System.out.println("Saque realizado usando cheque especial!");
            System.out.println("Taxa de R$ " + taxa + " aplicada sobre o valor usado do cheque especial.");
        }
        else {
            System.out.println("Saldo insuficiente, mesmo com cheque especial!");
        }
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    

    public void setChequeEspecial(double valor) {
        double cheque = 50.00;
        if(valor > 500){
            cheque = valor * 0.50;
        }
        this.chequeEspecial = cheque;
    }


    public void pagarBoleto(double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("O boleto no valor "+ valor + " R$ foi pargo com sucesso");
            return;
        }
        if(((this.saldo + this.chequeEspecial) >= valor)){
            double restante = valor - this.saldo;
            this.saldo = 0;
            this.chequeEspecial = restante;
            this.saldo -= (restante *0.2) + restante; 
            System.out.println("O boleto no valor "+ valor + " R$ foi pargo com sucesso");
            System.out.println("Você usou do seu cheque especial "+ restante + " R$");
            return;
        }else{
            System.out.println("Saldo insuvisiente para pagar o boleto");
        }
    }


    public boolean isCheque(){
        if(this.saldo < 0) {
            return true;
        }
        return false;
    }


    
}
