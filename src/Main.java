import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        String userName, password;

        Scanner scanner= new Scanner(System.in);
        System.out.print("Your Username: ");
        userName= scanner.nextLine();

        System.out.print("Your password: ");
        password= scanner.nextLine();


        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("You enter successfully!");

        } else {
            System.out.println("The information you entered is incorrect");
        }

    }
    }