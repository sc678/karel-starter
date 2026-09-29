import stanford.karel.*;

public class MyKarel extends Karel {
    public void run() {
        // Move to the first beeper
        turnLeft();
        move();
        turnLeft();
        turnLeft();
        turnLeft();
        move();
        move();

        // Pick up the beeper
        pickBeeper();

        // Move to the corner
        move();
        move();

        turnLeft();
        move();
        move();

        // Place the beeper
        putBeeper();

        // Turn and continue
        turnLeft();


        // Move to the next beeper

        // Pick up the beeper
        pickBeeper();

        // Turn around
        move();
        move();

        turnLeft();
        move();

        // Place the beeper
        putBeeper();

        // Continue forward
        move();
        move();

        // Turn the corner
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();
        turnLeft();
        move();
        move();

        // Pick up another beeper
        pickBeeper();

        // Move and place it
        move();
        move();

        putBeeper();

        // Continue to the end
        turnLeft();
        move();
        move();
        turnLeft();
    }
}



























