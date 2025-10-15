package model;

public class Banco {

    private final int NUCONTA = (int)(Math.random() * 1000);
    private String tipo;
    private User user;
    private double saldo;
    

    public Banco(String tipo, User user, double saldo) {
        this.tipo = tipo;
        this.user = user;
        this.saldo = saldo;
    }

    public int getNUCONTA() {
        return NUCONTA;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String extrado() {
        return String.format("Seu saldo é R$ %f", this.getSaldo());
    }

    public String depositar(double valor) {
        if(valor > 0){
            this.setSaldo(this.getSaldo() + valor);
        }
        return String.format("Deposito realiza com sucesso seu novo  saldo é R$ %f", this.getSaldo());
    }

    public String saque(double valor) {

        if(this.getSaldo() >= valor ){
            this.setSaldo(this.getSaldo() - valor);
            return String.format("Seu saldo é R$ %f", this.getSaldo());
        }
        
        return "Saldo insuficiente!!";

        
    }

    @Override
    public String toString() {
        return "Banco [NUCONTA=" + NUCONTA + ", tipo=" + tipo + ", user=" + user + ", saldo=" + saldo + "]";
    }

}
