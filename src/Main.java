import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void displayTotal(People people){
        System.out.println("Total: $500");
        System.out.println("Have a nice day " + people.name);
    }

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        while(true){
            People player = new People("Robert",6);
            People random1 = new People("Sam",1);
            People random2 = new People("Harry",2);
            People random3 = new People("Reginala",3);
            People random4 = new People("Mustard",4);
            People random5 = new People("Ketchup",5);

            ArrayList<String> areas = new ArrayList<String>();
            areas.add("in the lobby");
            areas.add("outside of the building");



            System.out.print("Hey welcome to our body shop! \nWhat kind of car do you have? ");
            String carType = input.nextLine();

            Thread.sleep(2000);
            System.out.println("Great we will take care of your " + carType + " real nice!\nGo ahead and wait wherever you like and we will call you.");

            Thread.sleep(2000);
            String placeToWait = areas.get(random.nextInt(2));
            System.out.println(player.name + " went to wait " + placeToWait);


            while (player.queueNumber > 0){
                System.out.println("Place in queue: " + player.queueNumber);
                player.queueNumber--;
                Thread.sleep(2000);
            }

            System.out.println("You're car is finished " + player.name);
            System.out.print("Wanna check it out? \nor go ahead and pay? ");
            String checkItOut = input.nextLine().toLowerCase();
            if (checkItOut.equals("check it out")){
                System.out.println("Lets go ahead and check her out!");
                System.out.print("Does it look like it needs more work \nor are you ready to pay? ");
                String toPay = input.nextLine();
                if (toPay.equals("pay")){
                    displayTotal(player);
                }
            }else{
                displayTotal(player);

            }

            System.out.print("Continue simulation: (y/n) ");
            String keepGoing = input.nextLine();
            if(keepGoing.equals("y")){

            }else{
                break;
            }

        }



    }
}
