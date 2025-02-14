import java.util.Scanner;

public class Project_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int UserNumber=0;
        int MyNumber=(int) (Math.random()*100);


        do { 
            System.out.println("gueess my number between 1 to 100 ");
            UserNumber =sc.nextInt();

            
        
        if (UserNumber==MyNumber) {
            System.out.println("wHOOO you GUUESDD IT RIGHT budddyy"); 
            break;
        }

        else if (UserNumber > MyNumber) {
            System.out.println("Your number is too big.");
        }
        else{
            System.out.println("your number is to small");

        }




    } while(UserNumber>=0);
    System.out.println("My number was " + MyNumber);
} 

}
