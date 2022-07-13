import java.util.LinkedList;

class Solution {
    public static int romanToInt(String s) {
        assert (1 <= s.length() && s.length() <= 15);
        char[] schar = s.toCharArray();
        LinkedList<Integer> sint = new LinkedList<Integer>();
        for (char c : schar) {
            if (c == 'M') {
                sint.add(1000);
            } else if (c == 'D') {
                sint.add(500);
            } else if (c == 'C') {
                sint.add(100);
            } else if (c == 'L') {
                sint.add(50);
            } else if (c == 'X') {
                sint.add(10);
            } else if (c == 'V') {
                sint.add(5);
            } else {
                sint.add(1);
            }
        }
        int sumfornow = 0;
        for (int i = 0; i < sint.size(); i++) {
            if (i == sint.size()-1) {
                sumfornow = sumfornow+sint.get(i);
            } else if (sint.get(i) >= sint.get(i+1)) {
                sumfornow = sumfornow+sint.get(i);
            } else {
                sumfornow = sumfornow+sint.get(i+1)-sint.get(i);
                i++;
            }
        }
        return sumfornow;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}