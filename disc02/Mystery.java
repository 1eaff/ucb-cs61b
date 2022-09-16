// Q2: Mystery
public class Mystery {
    /** find the minimum element, from index k, and return it's index. */
    public static int mystery(int[] inputArray, int k) {
        int x = inputArray[k];
        int answer = k;
        int index = k + 1;
        while (index < inputArray.length) {
            if (inputArray[index] < x) {
                x = inputArray[index];
                answer = index;
            }
            index = index + 1;
        }
        return answer;
    }

    /** selection sort. */
    public static void mystery2(int[] inputArray) {
        int index = 0;
        while (index < inputArray.length) {
            int targetIndex = mystery(inputArray, index);
            int temp = inputArray[targetIndex];
            inputArray[targetIndex] = inputArray[index];
            inputArray[index] = temp;
            index = index + 1;
        }
    }

    public static void main(String[] args) {
        org.junit.Assert.assertEquals(4, mystery(new int[]{3, 0, 4, 6, 3}, 2));
        int[] arr = new int[] {3, 0, 4, 6, 3};
        mystery2(arr);
        org.junit.Assert.assertArrayEquals(new int[]{0, 3, 3, 4, 6}, arr);
    }
}
