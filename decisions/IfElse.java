import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("You cannot vote!");
        } else{
            System.out.println("Be a responsible citizen. Pls vote");
        }
    }
}
