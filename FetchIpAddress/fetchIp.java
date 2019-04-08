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
			System.out.println("Enter url for which IP needed : ");
			String s=sc.nextLine();

			InetAddress ip = InetAddress.getByName(new URL(s).getHost());
			

			System.out.println("Public Ip of "+s+" : ");
			//Showing only the Ip address
			String ipSeg[]=ip.toString().split("/");
			System.out.println(ipSeg[ipSeg.length-1]);
		}
		catch(MalformedURLException e)
		{
			System.out.println("Given URL is invalid");
		}
	}
}


