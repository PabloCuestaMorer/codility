package pablocm;

import org.junit.jupiter.api.Test;

class BinaryGapTest {

    final int N = 9;

    @Test
    void solution() {
        String binary = Integer.toBinaryString(N);
        System.out.println(N + " to binary: " + binary);
        String[] gaps = binary.split("1");
        System.out.println("gaps.length: " + gaps.length);
        int longest = 0;
        if (binary.endsWith("0")) {
            for (int i = 1; i < gaps.length - 1; i++) {
                if (gaps[i].length() > longest) {
                    longest = gaps[i].length();
                }
                System.out.println("gaps[" + i + "]:" + gaps[i]);
            }
        } else {
            for (int i = 1; i < gaps.length; i++) {
                if (gaps[i].length() > longest) {
                    longest = gaps[i].length();
                }
                System.out.println("gaps[" + i + "]:" + gaps[i]);
            }
        }

        System.out.println("Return: " + longest);
    }
}