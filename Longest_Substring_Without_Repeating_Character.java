import java.util.HashSet;
import java.util.Set;

public class Longest_Substring_Without_Repeating_Character {
    public static void main(String[] args) {
        String s = "abcabcbb";
//        System.out.println(lengthOfLongestSubstring(s));
        System.out.println(lengthOfLongestSubstringV2(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int maxLen = 0;

        int l=0, r=0;
        StringBuilder sc = new StringBuilder();

        while(r < s.length() && l < s.length()) {
            char ch = s.charAt(r);

            if(sc.toString().contains(String.valueOf(s.charAt(r)))) {
                while(sc.toString().contains(String.valueOf(s.charAt(r)))) {
                    sc.deleteCharAt(0);
                    l++;
                }
            }

            sc.append(s.charAt(r));
            maxLen = Math.max(maxLen, (r-l)+1);
            r++;
        }

        return maxLen;
    }
    public static int lengthOfLongestSubstringV2(String s) {
        Set<Character> set = new HashSet<>(); // To store unique elemnts


        int l = 0, r = 0;
        int maxLen = 0;

        while(r < s.length()) {
            char ch = s.charAt(r);


            //shrink
            if(set.contains(ch)) {
                while(l <= r && set.contains(ch)) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }

            // grow
            if(!set.contains(ch)) {
                set.add(ch);
            }


            // ans calc
            maxLen = Math.max(maxLen, (r-l)+1);

            r++;
        }

        return maxLen;
    }
}
