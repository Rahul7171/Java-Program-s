import java.net.*;
import java.io.*;
public class TCPClient
{
		public static void main(String args[])throws Exception{
		Socket sock=new Socket("117.239.186.68",3000);
		BufferedReader keypad=new BufferedReader(new InputStreamReader(System.in));
		OutputStream os=sock.getOutputStream();
		PrintWriter pw=new PrintWriter(os,true);
		InputStream istream=sock.getInputStream();
		BufferedReader recieveRead=new BufferedReader(new InputStreamReader(istream));
		System.out.println("Start the chitchat,and type Enter key");
		String sm,rm;
		while(true)
		{
			sm=keypad.readLine();
			pw.println(sm);
			pw.flush();
		
		if((rm=recieveRead.readLine())!=null)
		{
			System.out.println(rm);
		}
		}
	}
}