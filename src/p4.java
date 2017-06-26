/**
 * Created by tanuj on 6/26/17.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class p4
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Table of? ");
        int num=sc.nextInt();
        System.out.println("Table upto?");
        int n=sc.nextInt();

        List<Integer> mul=new ArrayList<Integer>();
        for(int i=1;i<=n;i++)
            mul.add(i);
        System.out.format("Table of %d upto %d : \n",num,n);
        mul.forEach(e-> System.out.println(num*e));
    }
}
