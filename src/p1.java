/**
 * Created by tanuj on 6/21/17.
 */

import java.io.*;
public class p1
{
    public static void main(String[] args)
    {
      InputStream is = null;
      OutputStream os = null;
      try{
          is = new FileInputStream("/home/tanuj/Desktop/Resume/1");
          os = new FileOutputStream("/home/tanuj/Desktop/copied");
          byte[] buffer= new byte[1024];
          int length ;
          while((length = is.read(buffer))>0)
          {
              os.write(buffer,0,length);
          }
          is.close();
          os.close();
      }
      catch (IOException e){
          e.printStackTrace();
      }
    }
}
