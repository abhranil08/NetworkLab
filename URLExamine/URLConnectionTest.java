import java.net.*;
import java.util.*;
import java.io.*;

class URLConnectionTest
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            String s=sc.next();
            URL url = new URL(s);
            URLConnection urlC = url.openConnection();
            
            //time and date of response in millisecond, which needs to be converted to a Date object
            long date = urlC.getDate();
            if(date==0)
            System.out.println("No date");
            else
            System.out.println(new Date(date));
            
            // Content Type
            System.out.println("Content type : "+urlC.getContentType());
            
            // Expiration time and date returned in milli seconds, which needs to be converted to a Date object. Returns 0 if no information fetched.
            long expDate=urlC.getExpiration();
            if (expDate==0)
            System.out.println("No expiration information ! ");
            else
            System.out.println(expDate);
        }
        catch(MalformedURLException e)
        {
            System.out.println("Invalid URL !");
        }
    }
}