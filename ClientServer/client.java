//package demo;

import java.lang.*;
import java.net.Socket;
import java.util.Scanner;

public class client {
	public static void main(String args[])throws UnknownHostException
	{
		int number,temp;
		Scanner sc = new Scanner(System.in);
		Socket s = new Socket("127.0.0.1",5000);
		Scanner sc1 = new Scanner(s.getInputStream());
		System.out.println("Enter a number : ");
		number = sc.nextInt();
		PrintStream p = new PrintStream(s.getOutputStream());
		p.println(number);
		temp = sc1.nextInt();
		p.println(temp);
		
	}

}
