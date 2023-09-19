import java.net.*;
import java.io.*;
import java.util.*;
class FileCopingClient{
	public static void main(String asdf[])throws IOException{
		byte b[]=new byte[3024];
		FileInputStream f=new FileInputStream("abc.txt");
		DatagramSocket dgs=new DatagramSocket(2000);
		int i=0;
		while(f.available()!=0){
			b[i]=(byte)f.read();
			i++;
		}
		f.close();
		dgs.send(new DatagramPacket(b,i,InetAddress.getLocalHost(),3000));
	}

}