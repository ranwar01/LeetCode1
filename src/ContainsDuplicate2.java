import java.util.HashMap;

public class ContainsDuplicate2 {
// LC 219 - easy practice again
    public static void main(String[] args) {
    int [] nums = {1, 2, 3, 1, 2, 3};
    boolean result = containsNearbyDuplicate(nums, 2);
        System.out.println("result: " + result);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            int current = nums[j];
            if (map.containsKey(current) && j - map.get(current) <= k) {
                return true;
            }
            else {
                map.put(current, j);
            }
        }
        return false;
    }


}
