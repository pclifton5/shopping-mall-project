import java.util.Scanner;

public class main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        //variables

        String welcome = "Welcome to the Shopping Mall!";
        String farewell = "Thank you for visiting the Shopping Mall!";

        //call order
        System.out.println(welcome);
        directory director = new directory();
        director.directory();

        //Directory method
//
//        checkout();

        System.out.println(farewell);
    }
}
