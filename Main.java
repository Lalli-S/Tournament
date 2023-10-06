import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of teams that the tournament has: ");
        int n = s.nextInt();
        System.out.println("Total number of teams that participating in the tournament are: " + n);
        ArrayList<String> G1 = new ArrayList<>();
        System.out.println("Group 1 has: " + n / 2 + "teams");
        ArrayList<String> G2 = new ArrayList<>();
        System.out.println("Group 2 has: " + n / 2 + "teams");
        System.out.println("        Group 1     |       Group 2     ");
        System.out.println("----------------------------------------");
        for (int i = 1; i <= n / 2; i++) {
            G1.add("Team" + i);
            G2.add("Team" + (i + (n / 2)));
        }
        for (int i = 1; i <= n / 2; i++) {
            System.out.println("        Team" + i + "       |       Team" + (i + (n / 2) + "        "));
        }
        Tournament tournament = new Tournament();
        Team team = new Team();
        Match match = new Match();
        ArrayList<List<String>> ans1=team.opponentList(G1);
        ArrayList<List<String>> ans2=team.opponentList(G2);
        System.out.println("Opponent list of Group 1 for the first round is:");
        System.out.println(ans1);
        System.out.println("Opponent list of Group 2 for the first round is");
        System.out.println(ans2);
        ArrayList<String> sol1 ;
        ArrayList<String> sol2 ;

        while (true) {
            sol1 = tournament.matchStart(ans1);
            System.out.println("Winner list of Group 1 after the completion of current round: ");
            System.out.println(sol1);
            sol2 = tournament.matchStart(ans2);
            System.out.println("Winner list of Group 2 after the completion of current round: ");
            System.out.println(sol2);
            ans1 = team.opponentList(sol1);
            ans2 = team.opponentList(sol2);
            if (!(ans1.isEmpty() && ans2.isEmpty())) {
                System.out.println("Opponent list of Group 1 for the current round is:");
                System.out.println(ans1);
                System.out.println("Opponent list of Group 2 for the current round is:");
                System.out.println(ans2);
            }
            if (sol1.size() == 1 && sol2.size() == 1) {
                break;
            }
        }
        ArrayList<String> winners = new ArrayList<>();
        winners.add(sol1.get(0));
        winners.add(sol2.get(0));
        int randomIndex = random.nextInt(winners.size());
        String winner = winners.get(randomIndex);
        System.out.println("After the completion of final round the winner is:");
        System.out.println("************"+winner+"************");
        System.out.println("Game is Over!");
    }
}
