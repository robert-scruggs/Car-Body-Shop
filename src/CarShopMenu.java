public class CarShopMenu {
    //variables
    int dentRepair = 100;
    int paintRepair = 200;
    int windShieldRepair = 300;
    int bumperRepair = 400;
    int fenderRepair = 500;
    int total = 0;

    public void displayCarMenu(){
        System.out.println(
                "1)Dent Repair \n" +
                        "2)Paint Repair \n" +
                        "3)Windshield Repair \n" +
                        "4)Bumper Repair \n" +
                        "5)Fender Repair");
        System.out.print("-->\t");
    }
    public static void displayTotal(People people){
        System.out.println("Total: $500");
        System.out.println("Have a nice day " + people.name);
    }

    //getter/setters/methods
    public void addToTotal(int menuItemPrice){
        this.total += menuItemPrice;
    }

    public int getDentRepair() {
        return dentRepair;
    }

    public void setDentRepair(int dentRepair) {
        this.dentRepair = dentRepair;
    }

    public int getPaintRepair() {
        return paintRepair;
    }

    public void setPaintRepair(int paintRepair) {
        this.paintRepair = paintRepair;
    }

    public int getWindShieldRepair() {
        return windShieldRepair;
    }

    public void setWindShieldRepair(int windShieldRepair) {
        this.windShieldRepair = windShieldRepair;
    }

    public int getBumperRepair() {
        return bumperRepair;
    }

    public void setBumperRepair(int bumperRepair) {
        bumperRepair = bumperRepair;
    }

    public int getFenderRepair() {
        return fenderRepair;
    }

    public void setFenderRepair(int fenderRepair) {
        fenderRepair = fenderRepair;
    }





}
