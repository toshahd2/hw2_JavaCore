import java.util.Arrays;
/**
 * Написать метод, возвращающий количество чётных элементов массива.
 * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 */
public class CountEvens {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 2, 3, 4};
        int[] array2 = {2, 2, 0};
        int[] array3 = {1, 3, 5};
        System.out.println("countEvens(" + Arrays.toString(array1) + ") -> " + countEvens(array1));
        System.out.println("countEvens(" + Arrays.toString(array2) + ") -> " + countEvens(array2));
        System.out.println("countEvens(" + Arrays.toString(array3) + ") -> " + countEvens(array3));
    }

    /**
     * Return the number of even ints in the given array. Note: the % "mod"
     * operator computes the remainder, e.g. 5 % 2 is 1.
     *
     * @param nums Array of ints.
     * @return The number of even ints in nums.
     * @since 0.0.1
     */
    public static int countEvens(int[] nums) {
        int evens = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }
}