import java.util.*;
import java.net.*;
class URLtest
{
    public static void main(String args[])throws UnknownHostException
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            System.out.println("Enter URL..");
            String s=sc.next();
            
            URL url=new URL(s);
            System.out.println("Protocol : "+url.getProtocol());
            System.out.println("Port : "+url.getPort());
            System.out.println("Host : "+url.getHost());
            System.out.println("File : "+url.getFile());
        }
        catch(MalformedURLException e)
        {
            System.out.println("Invalid URL !");
        }
    }
}