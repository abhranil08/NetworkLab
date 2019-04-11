import java.util.*;
import java.io.*;
import java.net.*;

import java.*;

class fetchIp
{

    public static void main(String args[])throws UnknownHostException
    {
        Scanner sc = new Scanner(System.in);
        try
        {
            //localhost Address
            InetAddress l=InetAddress.getLocalHost();
            System.out.println(printIp(l.toString()));
            
            System.out.println("Enter url or Domain Name for which IP needed : ");
            String s=sc.nextLine();
            
            InetAddress ip = InetAddress.getByName(new URL(s).getHost());
            
            System.out.println("Public Ip of "+s+" : ");
            //Showing only the Ip address
            System.out.println(printIp(ip.toString()));

            // When a particular Address corresponds to many machines
            System.out.println("Enter url or Domain Name for which IP needed : ");
            String s1=sc.nextLine();
            
            InetAddress getAllIp[] = InetAddress.getAllByName(new URL(s1).getHost());
            for(InetAddress str: getAllIp)
            System.out.println(printIp(str.toString()));
            

        }
        catch(MalformedURLException e)
        {
            System.out.println("Given URL is invalid");
        }
    }
    public static String printIp(String s)
    {
        String ipSeg[]=s.split("/");
        return (ipSeg[ipSeg.length-1]);
    }
}