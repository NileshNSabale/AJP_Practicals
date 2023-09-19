import java.net.*;
import java.io.*;
import java.util.*;
class MyClient {
	public static void main(String asdf[])throws IOException{
		Scanner sc=new Scanner(System.in);
		Socket s=new Socket("Nilesh_31",3333);
		
		DataInputStream dis=new DataInputStream(s.getInputStream());
		DataOutputStream dos=new DataOutputStream(s.getOutputStream());
		String str1="",str2="";
		
		while(!str1.equalsIgnoreCase("bye")){
			System.out.println("Client :");
			str1=sc.nextLine();
			dos.writeUTF(str1);
			
			str2=dis.readUTF();
			System.out.println("Server"+str2);
		}
		
		s.close();
	}
}