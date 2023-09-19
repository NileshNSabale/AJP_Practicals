import java.net.*;
import java.io.*;
import java.util.*;
class MyServer {
	public static void main(String asdf[])throws IOException{
	Scanner sc=new Scanner(System.in);
	ServerSocket ss=new ServerSocket(3333);
	Socket s=ss.accept();
	
	DataInputStream dis=new DataInputStream(s.getInputStream());
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	
	String str1="",str2="";
	while(!str1.equalsIgnoreCase("bye")){
			str1=dis.readUTF();
			System.out.println("client :"+str1);
			
			System.out.println("Server :");
			str2=sc.nextLine();
			dos.writeUTF(str2);
	}
	s.close();
	}
}