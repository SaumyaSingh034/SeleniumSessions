package javaSessions;

public class TestAbstract extends AbstractClassPractice{
    @Override
    public void cricketTeamCountryName() {
        System.out.println("INDIA");
        System.out.println("AUSTRALIA");
        System.out.println("NEW ZEALAND");
        System.out.println("SRI LANKA");
    }

    @Override
    public void cricketTeamJersyColor() {
        System.out.println("BLUE");
        System.out.println("YELLOW");
        System.out.println("BLACK");
        System.out.println("GREEN");

    }

    public static void main(String[] args){
        AbstractClassPractice abs = new TestAbstract();
        abs.cricketTeamCountryName();
        abs.cricketTeamJersyColor();
        abs.displayDataForCricket();

        System.out.println("**************** Test Abstract Class ******************");

        TestAbstract test = new TestAbstract();
        test.cricketTeamCountryName();
        test.displayDataForCricket();
        test.cricketTeamJersyColor();
    }

}
