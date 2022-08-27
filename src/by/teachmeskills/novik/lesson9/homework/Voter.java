package by.teachmeskills.novik.lesson9.homework;

import java.util.Random;

public class Voter {
    public static void vote() {
        Random random = new Random();
        int r = random.nextInt(100) + 1;
        if (r <= 25) {
            OfficialCandidate.offVotes++;
        } else if (r <= 50) {
            IllegalCandidate.illVotes++;
        } else if (r <= 75) {
            RandomCandidate.randVotes++;
        } else {
            AgainstAllCandidate.agVotes++;
        }
    }
}
