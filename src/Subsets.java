import java.util.ArrayList;
import java.util.List;
// need to practice more
public class Subsets {

    public static void main(String [] args){}

    public List<List<Integer>> subsets(int [] nums){
        List<List<Integer>> subsets = new ArrayList<>();
        generateSubsets(0, nums, new ArrayList<Integer>(), subsets);

        return subsets;
    }

    private void generateSubsets(int index, int[] nums, List<Integer> current, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(current));
        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(index + 1, nums, current, subsets);
            current.remove(current.size() - 1);
        }
    }
}
