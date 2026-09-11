public class Main {

    private static int[] nums = new int[5];

    public static void main(String[] args) {
        fillNums();

        System.out.println("Nums array:");

        printNums();
    }

    // Fills the nums array in reverse order (5, 4, 3, 2, 1)
    private static void fillNums() {
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = nums.length - i;
        }
    }

    // Prints the nums array.
    private static void printNums() {
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }

}
