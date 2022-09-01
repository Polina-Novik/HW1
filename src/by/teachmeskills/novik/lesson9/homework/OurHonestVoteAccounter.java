package by.teachmeskills.novik.lesson9.homework;

import java.util.Random;

public class OurHonestVoteAccounter {
    public static void change() {
        Random random = new Random();
        int r = random.nextInt(4);
        int rr = random.nextInt(4);
        int a = 0;
        a = getA(r, a);
        extracted(rr, a);
        zero(r);
    }

    private static void zero(int r) {
        switch (r) {
            case 0:
                AgainstAllCandidate.agVotes = 0;
                break;
            case 1:
                IllegalCandidate.illVotes = 0;
                break;
            case 2:
                OfficialCandidate.offVotes = 0;
                break;
            case 3:
                RandomCandidate.randVotes = 0;
                break;
        }
    }

    private static void extracted(int rr, int a) {
        switch (rr) {
            case 0:
                AgainstAllCandidate.agVotes += a;
                break;
            case 1:
                IllegalCandidate.illVotes += a;
                break;
            case 2:
                OfficialCandidate.offVotes += a;
            case 3:
                RandomCandidate.randVotes += a;
        }
    }

    private static int getA(int r, int a) {
        switch (r) {
            case 0:
                a = AgainstAllCandidate.agVotes;
                break;
            case 1:
                a = IllegalCandidate.illVotes;
                break;
            case 2:
                a = OfficialCandidate.offVotes;
                break;
            case 3:
                a = RandomCandidate.randVotes;
                break;
        }
        return a;
    }
}
