/*
 * Created by PabloCM on 12/11/2020 10:32 pm with IntelliJ IDEA
 * Project CyclicRotation.java
 */

import pcm.CyclicRotation;

public class Main {

    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();

        //Input:
        int K = 3;
        int[] A = {3, 8, 9, 7, 6};

        //Output
        if (A != null && A.length > 0) {
            int[] output = cyclicRotation.solution(A, K);
            for (int i = 0; i < output.length; i++) {
                System.out.println("A[" + i + "]: " + output[i]);
            }
        } else {
            System.out.println("Empty array");
        }
    }

}
