package javaSessions;

public class TestInterface implements PracticeInterface {
    @Override
    public void displayCricketData() {
        PracticeInterface.super.displayCricketData();
        System.out.println("From Implemented Test Inteface Class");
    }

    @Override
    public void cricketPlayerName() {
        System.out.println("VIRAT KHOLI");
        System.out.println("MS DHONI");

    }

    public void testData(){
        System.out.println("Testing from child Class");
    }


    public static void main(String[] args){
        PracticeInterface pI = new TestInterface();
        pI.cricketPlayerName();
        pI.displayCricketData();
        PracticeInterface.cricketTeamPlayNo();

        System.out.println("********* Child Class Object ************** ");

        TestInterface tI = new TestInterface();
        tI.cricketPlayerName();
        tI.displayCricketData();
        tI.testData();
    }
}
