package petshop;

public class PetShop {

    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;

    public PetShop() {
        this.clean = true;
        this.water = 30;
        this.shampoo = 30;
        this.pet = null;
    }

    public void darBanho(){
        if(this.pet == null){
            System.out.println("Coloque o pet na maquina para da banho");
            return;
        }

        this.shampoo -= 2;
        this.water -= 10;

        pet.setClean(true);

        System.out.println("O pet esta limpo");
    }

    public void addWater(){
        if( this.water == 30){
            System.out.println("A capacidade de agua da maquina esta no maximo");
            return;
        }

        this.water += 2;
    }

    

     public void addShampoo(){ 
        if( this.shampoo == 10){
            System.out.println("A capacidade de shampoo da maquina esta no maximo");
            return;
        }

        this.shampoo += 2;
    }

    public boolean hasPet(){
        return this.pet != null;
    }

    public boolean isClean() {
        return clean;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet){
        if(!this.isClean()){
            System.out.println("A maquina esta suja, para colagar o pet é necessario fazer a limpeza da maquina");
            return;
        }
        if(this.hasPet()){
            System.out.printf("O pet %s esta na maquina nesse momento \n", pet.getName());
            return;
        }

        this.pet = pet;

    }

    public void removePet(){
        this.clean = this.pet.isClean();
        System.out.printf("O pet %s  esta limpo \n", pet.getName());
        this.pet = null;
    }

    public void wash(){
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;

        System.err.println("Maquina pronta para aprocimo pest");
    }

}