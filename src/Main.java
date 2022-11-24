import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        CarShopMenu carShopMenu = new CarShopMenu();

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



            System.out.print("Hey welcome to Robert's Body Emporium! \n\nWhat can we assist you with? \n");
            carShopMenu.displayCarMenu();
            ArrayList <Integer> runningTotal = new ArrayList<Integer>();
            boolean lookingAtMenu = true;
            do{
                for (int i = 0; i < runningTotal.size(); i++){
                    System.out.println(runningTotal.get(i) + " \n");
                }
                int menuItem = input.nextInt();
                input.nextLine();
                runningTotal.add(menuItem);
                System.out.print("Anything else? ");
                String anythingElse = input.nextLine().toLowerCase();
                if (anythingElse.equals("yes")){
                    continue;
                }else{
                    break;
                }

            }while(lookingAtMenu);

            for (int i = 0; i < runningTotal.size(); i++){
                System.out.println(runningTotal.get(i));
            }

            Thread.sleep(2000);
            System.out.println("\n");

            Thread.sleep(2000);
            String placeToWait = areas.get(random.nextInt(2));
            System.out.println(player.name + " went to wait " + placeToWait + "\n");


            while (player.queueNumber > 0){
                System.out.println("Place in queue: " + player.queueNumber);
                player.queueNumber--;
                Thread.sleep(2000);
            }

            System.out.println("\nYou're car is finished " + player.name + "\n");
            System.out.print("Wanna check it out? \nor go ahead and pay? ");
            String checkItOut = input.nextLine().toLowerCase();
            if (checkItOut.equals("check it out")){
                System.out.println("Lets go ahead and check her out!");
                System.out.print("Does it look like it needs more work \nor are you ready to pay? ");
                String toPay = input.nextLine();
                if (toPay.equals("pay")){
                    carShopMenu.displayTotal(player);
                }
            }else{
                carShopMenu.displayTotal(player);

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
