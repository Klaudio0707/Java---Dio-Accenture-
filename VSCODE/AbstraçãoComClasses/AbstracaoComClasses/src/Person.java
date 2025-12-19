
public class Person {

    private static String teste;
    public static String teste(){
        return "teste";
    }

    public static void setTeste(String testeParam){
        teste = testeParam;
    }
    public static String getTeste(){
        return teste;
    }
    private String name;

    public int age;

    public String getName(){
        
        return name + ", Olá ";

    }
public void setName(String nome){
    this.name = nome;
    
}

    public int getAge(){
        return age*2;
    }

    public void setAge(int age){
        this.age = age;
    }
}