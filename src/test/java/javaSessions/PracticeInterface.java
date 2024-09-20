package javaSessions;

public interface PracticeInterface {

    public default void displayCricketData(){
        System.out.println("Hi I am from Interface Class class");
    }

    public static void cricketTeamPlayNo(){
        System.out.println("The Number of Player in team should be 11");
    }

    public abstract void cricketPlayerName();
}
