//Tcp connection from server side
import java.io.*;
import java.net.*;
public class TCPServer
{  
    public static void main(String args[]) throws Exception
    {
            	ServerSocket serversocket=new ServerSocket(3000);
	System.out.println("Server is ready for chatting");
	Socket s=serversocket.accept();
	                    //Reading from keyboard
	 BufferedReader   keyRead=new BufferedReader(new InputStreamReader(System.in));
                  OutputStream ostream=s.getOutputStream();
	PrintWriter pwrite=new PrintWriter(ostream,true);
	InputStream istream=s.getInputStream();
                 BufferedReader receiveRead=new BufferedReader(new InputStreamReader(istream));
	String receiveMessage,sendMessage;
                 while(true)
	{
                  	if((receiveMessage=receiveRead.readLine())!=null)
                    	{
 			System.out.println(receiveMessage);
                   	}
	sendMessage=keyRead.readLine();
           	pwrite.println(sendMessage);
           	pwrite.flush();
	}
          }
        
}                