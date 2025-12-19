public class App {
    public static void main(String[] args) {
       var male = new Person();
        Person.setTeste("testeParam");
       male.setName("Claudio");
       male.setAge(29);
       var female = new Person();
      var teste = new Person();
    //    teste.setTeste("teste123");
       female.setName("Bruna");
       female.setAge(25);

       System.out.println("Male name: " + male.getName()+ "age: " + male.getAge());
       System.out.println("female name: "+ female.getName() + "age: " + female.getAge());
       System.out.println("teste" + Person.getTeste() );
    }
}