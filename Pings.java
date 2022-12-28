import java.io.*;
import java.net.*;
import java.util.*;
import java.text.*;

public class Pings {
    public static void main(String[] args) throws IOException {
        ServerSocket s = new ServerSocket(2000);

        while (true) {
            Socket c = s.accept();
            InputStream in = c.getInputStream(); // read data as bytes
            InputStreamReader inr = new InputStreamReader(in); // reads a single character
            BufferedReader br = new BufferedReader(inr); // reads data as string
            String str = br.readLine(); // reads the line of text
            System.out.println("Ping command received from " + c.getInetAddress() + "with string +" + str);
            PrintStream ps = new PrintStream(c.getOutputStream());
            ps.println(str);
            if (str.equals("exit")) {
                break;
            }
        }
    }
}