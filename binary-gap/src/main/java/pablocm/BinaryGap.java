/*
 * Created by PabloCM on 11/11/2020 08:59 pm with IntelliJ IDEA
 * Project binary-gap
 */

package pablocm;

public class BinaryGap {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        String[] gaps = binary.split("1");

        int longest = 0;
        if (binary.endsWith("0")) {
            for (int i = 1; i < gaps.length - 1; i++) {
                if (gaps[i].length() > longest) {
                    longest = gaps[i].length();
                }
            }
        } else {
            for (int i = 1; i < gaps.length; i++) {
                if (gaps[i].length() > longest) {
                    longest = gaps[i].length();
                }
            }
        }
        return longest;
    }

}
