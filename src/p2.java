/**
 * Created by tanuj on 6/26/17.
 */
import java.io.*;
public class p2
{
    public static void main(String[] args)throws Exception
    {
        Employee s1 = new Employee("Tanuj Kapila");

        FileOutputStream fout = new FileOutputStream("/home/tanuj/Desktop/employee.txt");
        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(s1);

        System.out.println("Serialized data saved in 'employee.txt' file");
    }
}
