public class Employee {
    //Fields
    private int id;
    private String firstname;
    private String lastname;
    private int Salary;

    //Constructor
    Employee(int id, String firstname, String lastname, int Salary){
        System.out.println("creating Employee ID Card");
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.Salary = Salary;
    }
    //Methods
    public int getid(){
        return id;
    }
    public String getfirstname(){
        return firstname;
    }
    public String getlastname(){
        return lastname;
    }
    public String getname(){
        String name = firstname + " " + lastname;
        return name;
    }
    public int getSalary(){
        return Salary;
    }
    public void setSalary(int Salary){
        if (Salary < 0){
            this.Salary = 0;
        }
        else {
            this.Salary = Salary;
        }
    }
    public int getAnnualSalary(){
        this.Salary = Salary * 12;
        return Salary;
    }
    public int raiseSalary(int percent){
        Salary = (1+(percent/100)) * this.Salary;
        return Salary;
    }
    public String toString(){
        String name = getname();
        return "ID: " + id + " | Name: " + name + " | Salary: " + Salary;
    }





}
