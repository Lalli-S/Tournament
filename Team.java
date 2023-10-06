import java.util.ArrayList;
import java.util.List;

public class Team {
    public ArrayList<List<String>> opponentList(ArrayList<String> oppo){
        Match match = new Match();
        int count = oppo.size();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        for (int i = 0; i < (count/2); i++) {
            arr1.add(oppo.get(i));
            arr2.add(oppo.get(i+(count)/2));
        }
        return match.teamUp(arr1,arr2,count);
    }
}
