import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_II_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int t = 9;
        int[] ans = twoSum(arr, t);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (mp.containsKey(target - arr[i])) {
                int idx = mp.get(target - arr[i]);

                return new int[]{idx + 1, i + 1};
            }
            mp.put(arr[i], i);
        }

        return new int[]{};
    }
}
