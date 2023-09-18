import java.net.*;
class InetAddressInstace {
	public static void main(String asdf[])throws UnknownHostException{
		InetAddress addr1=InetAddress.getByName("www.google.com");
		InetAddress addr2=InetAddress.getByName("msbte.org.in");
		System.out.println(addr1);
		System.out.println(addr2);
		System.out.println("equals ="+addr1.equals(addr2));
		byte arr[]={(byte)103,(byte)162,(byte)247,(byte)95};
		InetAddress addr3=InetAddress.getByAddress(arr);
		System.out.println(addr3);
		System.out.println("Host Address :"+addr1.getHostAddress());
		System.out.println("Host Name :"+addr1.getHostName());
		System.out.println("is multicast address :"+addr1.isMulticastAddress());
		System.out.println("Convertion to string :"+addr2.toString());
	}
}