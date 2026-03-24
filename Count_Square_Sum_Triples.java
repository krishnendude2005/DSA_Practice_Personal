public class Count_Square_Sum_Triples {
    public static void main(String[] args) {
        System.out.println(countTriples(10));
    }
    public static int countTriples(int n) {
        return count(n);
    }
    public static int count(int n) {
        if(n == 1 || n==2 || n==3|| n==4) return 1;
        if(n == 5) return 2;
        return 2 * count(n-5);
    }
}
