import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Set;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {

        String path = "D:\\SoftUni\\Streams, Files and Directories_Lab\\04. Java-Advanced-Files-and-Streams-Lab-Resources\\input.txt";

        Set<Character> separators  = Set.of(',', '.', '!', '?');

        FileInputStream inputStream = new FileInputStream(path);
         int nextByte = inputStream.read();

        PrintStream printStream = new PrintStream("out.txt");

        while (nextByte != -1  ){
            char symbol = (char)(nextByte);
            if(!separators.contains(symbol)){
                printStream.print(symbol);
            }
            nextByte = inputStream.read();
        }
    }
}
