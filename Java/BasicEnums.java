// enum Status{
//     relationship,single,oneSided,married
// }

enum Status{
    relationship(1000),single(0),oneSided(300),married(10000);

    //the amount of spending for your other
    int costOfLifeStatus;

    private Status(int cost) {
        this.costOfLifeStatus = cost;
    }

    public int getCost() {
        return costOfLifeStatus;
    }
    

}

public class BasicEnums {
    public static void main(String[] args) {
        Status myStatus = Status.relationship;
        Status broStatus = Status.oneSided;
        Status allStatus[] = Status.values();

        System.out.println("My relationship status is: " + myStatus);
        System.out.println("Bro's relationship status is: " + broStatus);
        System.err.println("Position of " + Status.relationship + "is: " + Status.relationship.ordinal());
        System.err.println("ordinal of " + Status.oneSided + "is: " + Status.oneSided.ordinal());
        System.out.println("-------------------------------------------------------------------");
        
        System.out.println("all the values in status are: ");
        for(Status s : allStatus){
            System.out.print(s+", ");
        }

        System.out.println("------------------------------------------------------------------");

        if(myStatus == Status.relationship){
            System.out.println("I am in a relationship ");
        }
        else if (myStatus == Status.single) System.out.println("I am single");
        else if (myStatus == Status.oneSided) System.out.println("Be-wafa");
        else System.out.println("I happily married!");

        System.out.println("and the amount of money I spend on my partner is: " + myStatus.getCost());
        
    }
    
}
