import java.net.*;
import java.io.*;
import java.util.*;
class FileCopingServer{
	public static void main(String asdf[])throws IOException{
		byte b[]=new byte[3024];
		FileOutputStream f=new FileOutputStream("asd.txt");
		DatagramSocket dgs=new DatagramSocket(3000);
		DatagramPacket dgp=new DatagramPacket(b,b.length);
		dgs.receive(dgp);
		int i=0;
		while(i<b.length){
			f.write(b[i]);
			i++;
		}
		System.out.println("Data copied successfully!!!");
	}

}