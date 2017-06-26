/**
 * Created by tanuj on 6/26/17.
 */
import java.lang.reflect.Field;
import java.lang.reflect.Method;
public class p3
{
    public static void main(String[] args)
    {
        Field[] fields = Employee.class.getDeclaredFields();
        Method[] methods = Employee.class.getDeclaredMethods();

        for(Field field : fields)
        {
            System.out.println("Feilds = " + field.getName());
        }
        System.out.println();
        for(Method method : methods)
        {
            System.out.println("Methods = "+ method.getName());
        }
    }
}
