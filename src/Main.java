import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");
        Scanner sc = new Scanner(System.in);
        System.out.print("Input number of username you want to input: ");
        int n = sc.nextInt();
        sc.nextLine();
        while(n-- !=0){
            String username= sc.nextLine();
            Matcher mathcer = pattern.matcher(username);

            if(mathcer.matches()){
                System.out.print("Valid");
            }else{
                System.out.print("Invalid");
            }
        }
    }
}