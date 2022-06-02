import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        ArrayDeque<String> printerQueue = new ArrayDeque<>();
        String command = scanner.nextLine();

          while (!command.equals("print")){

             if(command.equals("cancel")){
                 String canceledFile = printerQueue.poll();
                 if(canceledFile == null){
                     System.out.println("Printer is on standby");
                 }else {
                     System.out.println("Canceled " + canceledFile);
                 }
             }else {
                 printerQueue.offer(command);
             }

              command = scanner.nextLine();

          }
          while (!printerQueue.isEmpty()){
              System.out.println(printerQueue.poll());
          }

    }
}
