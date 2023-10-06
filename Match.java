import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Match {
    public ArrayList<List<String>> teamUp(ArrayList<String> g1, ArrayList<String> g2, int n){
        List<String> list1 = g1;
        List<String> list2 = g2;
        Collections.shuffle(list1);
        Collections.shuffle(list2);

        // Create an ArrayList to hold the resulting lists
        ArrayList<List<String>> resultList = new ArrayList<>();

        // Define the number of unique elements you want in the ArrayList
        int numUniqueElements = n/2; // Change this as needed

        // Add unique elements from the shuffled arrays to the ArrayList
        for (int i = 0; i < numUniqueElements; i++) {
            List<String> randomList = new ArrayList<>();
            randomList.add(list1.get(i));
            randomList.add(list2.get(i));
            resultList.add(randomList);
        }

        // Display the resulting ArrayList of Lists
//    for (List<String> randomList : resultList) {
//            System.out.println(randomList);
//        }
        return resultList;
    }

}
