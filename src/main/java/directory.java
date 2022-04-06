import java.util.Scanner;

public class directory extends main{
    public static void directory(){
        System.out.println("Please choose which store you want to go to:\n" +
                "1. Games Store\n"+
                "2. Clothes Store\n"+
                "3. Music Store\n"+
                "4. Checkout ");

        int input = scanner.nextInt();
        switch(input){
            case 1:
                System.out.println("The Games Store is on the upper level to the left.");
                //gamesStore();
                break;
            case 2:
                System.out.println("The Clothes Store is on this floor to your right.");
                //clothesStore();
                break;
            case 3:
                System.out.println("The Music Store is on the upper floor to your right.");
                //musicStore();
                break;
            case 4:
                System.out.println("The checkout line and exit our on this floor to your left.");
                //checkout();
                break;
            default:
                System.out.println("Please enter 1-4 for directions or if you want to exit please enter 0.");
                if (input == 0){
                    System.out.println("Thank you for visiting the Shopping Mall!");
                    System.exit(0);
                }
        }
        }
    }

