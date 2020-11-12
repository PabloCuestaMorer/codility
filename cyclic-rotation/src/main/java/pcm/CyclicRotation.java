/*
 * Created by PabloCM on 12/11/2020 02:14 pm with IntelliJ IDEA
 * Project cyclic-rotation
 */

package pcm;

public class CyclicRotation {

    public int[] solution(int[] A, int K) {
        /*
        * We will save into a var the last digit, and move all elements +1 position
        * We will do this K times
        * Because we want to move all the elements one position forward K times.
        */
        if (A != null && A.length > 0) {
            for (int j = 0; j < K; j++) {
                int lastNum = A[A.length - 1];
                for (int i = A.length - 1; i > -1; i--) {
                    if (i == 0) {
                        A[0] = lastNum;
                    } else {
                        A[i] = A[i - 1];
                    }
                }
            }
        }
        return A;

    }

}
