import java.util.Scanner;

public class Count_Number_Of_Occurance_Of_Word_In_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str ="Pseudopseudohypoparathyroidism is an extraordinarily esoteric term.\n" +
                "                In computational linguistics, pseudopseudohypoparathyroidism appears rarely,\n" +
                "                yet pseudopseudohypoparathyroidism challenges naive substring algorithms.\n" +
                "                Many developers miscount pseudopseudohypoparathyroidism however\n" +
                "                pseudopseudohypoparathyroidism remains a fascinating lexical anomaly.";

        String word = "pseudopseudohypoparathyroidism";
        int count = 0;

        String[] words = str.split("\\s+");
        for(String word1 : words) {
            if(word1.equalsIgnoreCase(word)) {
                count++;
            }
        }
        System.out.println("     " + count);

    }
}
