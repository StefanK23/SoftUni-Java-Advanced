
import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

           ArrayDeque<String> browser = new ArrayDeque<>();
           String currentUrl = "";

           String command = scanner.nextLine();

           while(!command.equals("Home")){
               if(command.equals("back")){
                   if(browser.isEmpty()){
                       System.out.println("no previous URLs");
                       command=scanner.nextLine();
                       continue;
                   }
                   String prevURL = browser.pop();
                   currentUrl= prevURL;
               }else {
                   if(!currentUrl.equals(""))
                       browser.push(currentUrl);
                       currentUrl= command;

               }
               System.out.println(currentUrl);
               command= scanner.nextLine();
           }

    }
}
