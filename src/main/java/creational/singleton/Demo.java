package creational.singleton;

public class Demo {

    public static void main(String[] args) {
        //kod po prawej stronie od '=' należy podmienić
        CommandStation station = CommandStation.getCommandStation();
        CommandStation station2 = CommandStation.getCommandStation();

        //wykonaj implementacje wzorca Singleton, w klasie CommandStation tak, aby
        //poniższy warunek został spełniony
    
        System.out.println(CommandStation.getCommandStationType());
        
        if (station == station2) {
            System.out.println("Bingo!");
        } else {
            System.out.println("Niepoprawnie zaimplementowany wzorzec Singleton");
        }


    }
}
