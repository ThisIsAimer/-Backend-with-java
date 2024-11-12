
public class car {
    String stringHere = "20";
    Integer year;
    int speed;
    int here = Integer.parseInt(stringHere);

    void accilerate(){
        speed += 10;
    }
    void brake(){
        speed -= 10;
    }

    public car(int carYear){
        year = carYear;
    }
    
}
