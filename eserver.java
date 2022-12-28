import java.io.*;
import java.net.*;

public class eserver{
    public static void main(String[] args) throws IOException{
        Socket c = null;
        ServerSocket s  = null;
        try {
            s = new ServerSocket(2000);
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            c = s.accept();
            DataInputStream is = new DataInputStream(c.getInputStream());
            PrintStream ps = new PrintStream(c.getOutputStream());
            while(true){
                String line = is.readLine();
                System.out.println("message received and sent back to client");
                ps.println(line);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
           