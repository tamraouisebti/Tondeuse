package service;

import domain.Lawn;
import domain.Mower;

public class MowerService {

    public static Lawn mow(String fileName) {
        Lawn lawn = new Lawn(fileName);

        for (Mower mower : lawn.getMowers()) {
            logMowerStartingDetails(mower);
            mower.mow(lawn.getxSize(), lawn.getySize());
            logMowerFinishingDetails(mower);
        }
        return lawn;
    }

    public static void logMowerStartingDetails(Mower mower) {
        System.out.println("The initiale Position of the mower is: Orientation: " + mower.getOrientation().getLabel()
                + ", X position : " + mower.getPosition().getX() + ", Y position " + mower.getPosition().getY());
    }

    public static void logMowerFinishingDetails(Mower mower) {
        System.out.println("The final Position of the mower is: Orientation: " + mower.getOrientation().getLabel()
                + ", X position : " + mower.getPosition().getX() + ", Y position " + mower.getPosition().getY());
    }
}
