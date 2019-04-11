import java.net.*;
import java.util.*;
import java.io.*;

class URLConnectionTest
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL..");
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
            
            // Last modified in milli seconds, which needs to be converted to a Date object. Returns 0, if not modified.
            long lastmod=urlC.getLastModified();
            if(lastmod==0)
            System.out.println("No information regarding last modification");
            else
            System.out.println("Last modified : "+new Date(lastmod));
            
            //Content length of the resource
            long contentLength = urlC.getContentLengthLong();
            if(contentLength == -1)
            System.out.println("Content unavailable");
            else
            System.out.println("Content length : "+contentLength);
            
            // Content of the resource
            System.out.println("***********************************************  CONTENT  ********************************************************");
            if(contentLength!=0 && contentLength!=-1)
            {
                int c;
                InputStream input = urlC.getInputStream();
                while((c = input.read())!=-1)
                System.out.print((char) c);
                
                input.close();
            }
            else
            {
                System.out.println("Content Unavailable");
            }
        }
        catch(MalformedURLException e)
        {
            System.out.println("Invalid URL !");
        }
    }
}