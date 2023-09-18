import java.net.*;
import java.util.*;
class PrQ1 {
	public static void main(String asdf[])throws UnknownHostException{
		Scanner sc=new Scanner(System.in);
		//InetAddress addr=InetAddress.getLocalHost();
		//System.out.println("Local Host :"+addr);
		System.out.println("Enter Host Name :");
		String hostnm=sc.nextLine();
		
		InetAddress addr=InetAddress.getByName(hostnm);
		System.out.println("IP Address :"+addr.getHostAddress());
		System.out.println("Host Name :"+addr.getHostName());
	}
}