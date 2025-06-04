package com.teamkc;

import com.birdbrain.Finch;

/**
 * FinalFinch class demonstrates how to control a Finch robot to perform a sequence of movements.
 * The Finch moves forward, turns left, then draws a 5-pointed star shape using repeated right turns and forward motions.
 */
public class FinalFinch {
     /**
     * The main method is the entry point of the program.
     * It connects to the Finch robot, plays a note, performs movement patterns, and disconnects.
     */
    public static void main(String[] args) {
    // Create a new Finch object and connect to the Finch robot
        Finch bird = new Finch();
     // Play a musical note (Middle C, 60 is the pitch, 0.5 seconds duration)
        bird.playNote(60,0.5);
     // Initial turn to the left (18 degrees at 50% speed)
        bird.setTurn("L", 18, 50);
    // Move forward 12.5 cm at 50% speed
        bird.setMove("F",12.5,50);
       
    // Loop to repeat turning and moving to draw a 5-pointed star
        for (int i = 0; i < 4; i++) {
    // Turn right 144 degrees at 50% speed
            bird.setTurn("R", 144, 50);
    // Move forward 12.5 cm at 50% speed
            bird.setMove("F",12.5,50);
            
        }

            
     // Stop all Finch movement
        bird.stop();
    // Disconnect from the Finch robot
        bird.disconnect();
    }
}
