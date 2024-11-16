public class bmw extends car {

    String sound;

        public bmw(String sound) {
        super(100);
        this.sound = sound;
    }
    

    // public bmw(String sound) {
        //     super(1990);
        //     this.sound=sound;
        // }
    void sound(){
        System.out.println("the car makes "+ sound+ " sound");
    }
    @Override
    void accilerate(){
        super.accilerate();
        speed += 20;
    }
    

    
    public static void main(String[] args){
        System.out.println("heyyyy");
    }
}
