import java.net.*;
import java.io.*;
import java.rmi.*;

public class swserver
{
    public static void main(String a[]) throws Exception
    {
        ServerSocket ser = new ServerSocket(10);
        Socket s = ser.accept();
        DataInputStream in = new DataInputStream(System.in);
        DataInputStream in1 = new DataInputStream(s.getInputStream());
        String sbuff[] = new String[8];
        PrintStream p;
        int sptr=0, sws=8, nf,ano, i;
        String ch;
        do 
        {
            p = new PrintStream(s.getOutputStream());
            System.out.print("Enter the number of frames: ");
            nf = Integer.p
        }
    }
}