import java.net.*;
import java.io.*;
public class ClientDemo
{
public static void main(String args[]) throws Exception
{
	Socket sock=new Socket("127.0.0.1",3000);
	BufferedReader keypad=new BufferedReader(new InputStreamReader(System.in));
	OutputStream os=sock.getOutputStream();
	PrintWriter pw=new PrintWriter(os,true);
	InputStream istream=sock.getInputStream();
	BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
	System.out.println("Start the chatting");
	String sm,rm;
	while(true)
	{
	sm=keypad.readLine();
	pw.println(sm);
	pw.flush();
	if((rm=receiveRead.readLine())!=null)
	{
	System.out.println(rm);
	}
	}
}
}