

public sealed abstract class Employee permits Manager,Salesman{
    private String code;

    private String name;

    private String andress;

    private String age;

    private double salary;

    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

  
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getAndress() {
        return andress;
    }


    public void setAndress(String andress) {
        this.andress = andress;
    }


    public String getAge() {
        return age;
    }

   
    public void setAge(String age) {
        this.age = age;
    }

    public Double getSalary(){
        return salary;
    }

    public Double setSalary(Double salary){
        this.salary = salary;
        return salary;
    }

}