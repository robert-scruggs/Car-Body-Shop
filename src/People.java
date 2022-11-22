public class People {
    //variables
    public String name;
    public int queueNumber = 0;

    //constructor
    public People(String name){
        this.name = name;
        queueNumber++;
        }

    public People(String name,int queue){
        this.name = name;
        this.queueNumber = queue;
    }

    public int getQueueNumber(){
        return queueNumber;
    }
}
