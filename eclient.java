import java.io.*;
import java.net.*;

public class eclient{
    public static void main(String[] args){
        String line;
        try {
            Socket c = new Socket("localhost", 2000);
            PrintStream os = new PrintStream(c.getOutputStream());
            DataInputStream is = new DataInputStream(System.in);
            DataInputStream is1 = new DataInputStream(c.getInputStream());

            do {
                System.out.println("Client: ");
                line = is.readLine();
                os.println(line);
                if (!line.equals("exit")) {
                    System.out.println("Server: " + is1.readLine());
                }
            }while (!line.equals("exit"));
            }
            catch (Exception e){
                System.out.println("socket closed");
            }
        }
    }