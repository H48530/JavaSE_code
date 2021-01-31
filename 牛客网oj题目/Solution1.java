import java.util.*;

public class Solution1 {
    public String solve(String s, String t) {
        // write code here
        int r = Integer.parseInt(s) + Integer.parseInt(t);
        return String.valueOf(r);
    }

    public static void main(String[] args) {

        Solution1 s = new Solution1();
        String ret = s.solve("99", "10");
        System.out.println(ret);
    }
}