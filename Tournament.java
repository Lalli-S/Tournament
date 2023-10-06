import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Tournament {
    public ArrayList<String> matchStart(ArrayList<List<String>> list) {
        Random random = new Random();
        Match match = new Match();
        ArrayList<String> winnerList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            List<String> matchWinner = list.get(i);
            int size = random.nextInt(matchWinner.size());
            String winner = matchWinner.get(size);
            winnerList.add(winner);
        }
        return winnerList;
    }
}
