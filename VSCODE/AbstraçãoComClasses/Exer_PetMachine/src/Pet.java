

public class Pet {

    //atributos da class Pet
    private String name;

    private boolean clean;
    
    //Construtor da class PET
    public Pet(String nome){
        this.name = nome;
        this.clean = false;
    }

    //sobrecarga do construtor
    public Pet(boolean clean) {
        this.clean = clean;
    }

    // metodo get
    public String getName(){
        return name;
    }
    // metodo set
    public boolean isClean(){
        return clean;
        }
        //metodo set
    public void setClean(boolean clean){
        this.clean = clean;
    }    

}