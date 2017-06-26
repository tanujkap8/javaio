/**
 * Created by tanuj on 6/26/17.
 */
import java.io.*;
public class p2_de
{
    public static void main(String[] args)throws Exception
    {
         ObjectInputStream in = new ObjectInputStream(new FileInputStream("/home/tanuj/Desktop/employee.txt"));
         Employee s=(Employee) in.readObject();
        System.out.println(s.name);
        in.close();
    }
}
