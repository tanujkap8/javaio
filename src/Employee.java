import java.io.Serializable;

/**
 * Created by tanuj on 6/26/17.
 */
public class Employee implements Serializable
{
    String name;
    int age;
    String designation;
    double salary;

    public String getName() {return name;}
    public int getAge(){return age;}
    public Employee(int age,String name)
    {
        this.age=age;
        this.name=name;
    }
    @Override
    public String toString(){
        return "Employee("+"name="+name+'\''+ ", age=" + age + ')';
    }

    public Employee(String name)
    {
        this.name = name ;
    }

    public void empAge(int empAge){ age = empAge;}

    public void empDesignation(String empDesig){designation = empDesig;}
    public void empSalary(double empSalary){ salary = empSalary;}
}
