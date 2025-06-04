package com.teamkc;

import com.birdbrain.Finch;

public class FinalFinch {
    public static void main(String[] args) {
        Finch bird = new Finch();
        bird.playNote(60,0.5);
   
        bird.setTurn("L", 18, 50);
        bird.setMove("F",12.5,50);
       

        for (int i = 0; i < 4; i++) {
            bird.setTurn("R", 144, 50);
            bird.setMove("F",12.5,50);
            
        }

            

        bird.stop();
        bird.disconnect();
    }
}