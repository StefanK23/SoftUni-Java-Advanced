
import java.util.Scanner;
import java.util.TreeSet;

public class SoftUniParty_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        TreeSet<String> vip = new TreeSet<>();
        TreeSet<String> regular = new TreeSet<>();

        String guest = scanner.nextLine();


        while (!guest.equals("PARTY")){
            if(Character.isDigit(guest.charAt(0))){
                vip.add(guest);
            }else {
                regular.add(guest);
            }


            guest = scanner.nextLine();
        }
        while (!guest.equals("END")){
            if(Character.isDigit(guest.charAt(0))){
                vip.remove(guest);
            }else {
                regular.remove(guest);
            }


            guest = scanner.nextLine();
        }


        System.out.println(vip.size() + regular.size());
        if(!vip.isEmpty()){
            System.out.println(String.join(System.lineSeparator(), vip));
        }
      if(!regular.isEmpty()){
          System.out.println(String.join(System.lineSeparator(), regular));
      }

    }
}
