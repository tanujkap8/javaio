import java.util.HashSet;
import java.lang.String;
import java.util.stream.Collectors;
public class p6
{
    public static void main(String[] args)
    {
        HashSet<Employee>emps=new HashSet<Employee>();
        emps.add(new Employee(15,"TANUJ"));
        emps.add(new Employee(20,"ROHAN"));
        emps.add(new Employee(21,"ESHAN"));
        emps.add(new Employee(26,"SALONI"));
        emps.add(new Employee(22,"SHUBHAM"));
        emps.add(new Employee(4,"ROHIT"));
        emps.add(new Employee(3,"ANKUR"));
        emps.add(new Employee(23,"ADITYA"));
        emps.add(new Employee(22,"ARJUN"));

        System.out.println(
                emps.stream()
                .filter(x -> x.getName().startsWith("S"))
                .filter(x -> x.getAge() > 24)
                .collect(Collectors.toList())
        );
    }
}
