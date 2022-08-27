package by.teachmeskills.novik.lesson9.homework;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Voter.vote();
        }
        gettingResults();
        System.out.println("After work of our honest vote accounter:");
        OurHonestVoteAccounter.change();
        gettingResults();
    }

    private static void gettingResults() {
        System.out.println("number of votes for official candidate: " + OfficialCandidate.offVotes);
        System.out.println("number of votes for illegal candidate: " + IllegalCandidate.illVotes);
        System.out.println("number of votes for random candidate: " + RandomCandidate.randVotes);
        System.out.println("Against all candidates: " + AgainstAllCandidate.agVotes);
    }
}
