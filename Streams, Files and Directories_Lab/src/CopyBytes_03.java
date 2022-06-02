import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;


public class CopyBytes_03 {
    public static void main(String[] args)throws IOException {

        String path = "D:\\SoftUni\\Streams, Files and Directories_Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";



        FileInputStream inputStream = new FileInputStream(path);
        int nextByte = inputStream.read();

        PrintStream printStream = new PrintStream("copyBytes.txt");

        while (nextByte != -1  ){

            if(nextByte == ' '  ){
                printStream.print((char)(nextByte));
            }else if(nextByte == '\r' ||nextByte == '\n' ){
                printStream.println();
            }else {
                printStream.print(nextByte);
            }
            nextByte = inputStream.read();
        }
    }
}
