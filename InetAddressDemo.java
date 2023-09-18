import java.net.*;
class InetAddressDemo{
	public static void main(String asdf[])throws UnknownHostException{
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println("getLocalHost : "+addr);
		InetAddress addr1=InetAddress.getByName("www.google.com.");
		System.out.println("getByName : "+addr1);
		InetAddress addr2=InetAddress.getByName("msbte.org.in");
		System.out.println("getByName : "+addr2);
		byte ipaddr[]={(byte)103,(byte)162,(byte)247,(byte)95};
		InetAddress addr3=InetAddress.getByAddress(ipaddr);
		System.out.println("getByAddress :"+addr3);
		System.out.println("getAllByName : ");
		InetAddress addr4[]=InetAddress.getAllByName("www.google.com");
		for(int i=0;i<addr4.length;i++){
			System.out.println(addr4[i]);
		}
	}
}