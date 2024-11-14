//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Robot myRobot = new Robot();  // Create a new Robot object
        myRobot.move();  // Make the Robot move
        myRobot.checkBatteryLevel();  // Check the battery level
        myRobot.stop();  // Stop the Robot
        myRobot.chargeBattery();  // Charge the Robot's battery
        myRobot.displayInfo(); //Displays Robot's name, color & weight

    }
}




