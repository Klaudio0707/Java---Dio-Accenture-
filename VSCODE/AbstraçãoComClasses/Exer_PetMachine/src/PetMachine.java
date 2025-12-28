

public class PetMachine {

    private boolean clean = true;
    
    private int water = 30;

    private int shampoo = 30;

    private Pet pet;
    
    // public petMachine(){

    // }

    public void takeShower(){
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para dar banho.");
            return;
        }
        if (!this.clean) {
            System.out.println("A máquina está suja! Lave-a antes do banho.");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo!");
    }

    public void addWater(){
        if(water == 30){
            System.out.println("A máquina já esta com a quantidade máxima de água.");
            return;
        }
        System.out.println("Adicionando água...");
        water += 2;
    }
    public void addShampoo(){
        if(shampoo == 30){
            System.out.println("A máquina já esta com a quantidade máxima de shampoo.");
            return;
        }
        System.out.println("Adicionando shampoo...");
        shampoo += 2;
    }

    public int getWater(){
        System.out.println("Quantidade de agua Atual: " + water);
        return water;
    }
    public int getShampoo(){
        System.out.println( "Quantidade de shampoo Atual: " + shampoo);
        return shampoo;
    }
    public boolean hasPet(){
       if (this.pet == null) {
           System.out.println("Sem pet na maquina" );
           return false;
       }
        
       System.out.println("Há um pet na máquina: " + pet.getName());
       return true;
    }
    public void setPet(Pet pet){
        if (!this.clean) {
            System.out.println("A máquina está suja. Limpe-a antes de colocar um pet.");
            return;
        }
        if(hasPet()){
            System.out.println("O pet "+ this.pet.getName() + " já está na máquina.");
            return;
        }
        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina.");
    }
    public void removePet(){
        if (this.pet == null) {
            System.out.println("Não há pet na máquina para remover.");
            return;
            
        }
        this.clean = this.pet.isClean();
        System.out.println("O pet foi removido da máquina.");
        this.pet = null;
    }
    public void washMachine(){
        if (water < 3 || shampoo <1) {
            System.out.println("Insumos insuficientes para lavar a máquina.");
            return;
        }
        this.water -= 3;
        this.shampoo -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa!");
    }

    
}