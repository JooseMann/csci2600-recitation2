public class Main {

    private static int[] nums = new int[5];
    private static float[] floats = new float[5];

    public static void main(String[] args) {
        fillNums();
        System.out.println("Nums array:");
        printNums();

        // Newline
        System.out.println();

        fillFloats();
        System.out.println("Floats array:");
        printFloats();

        System.out.println("The product of the nums:")
        multNums();
    }

    // Fills the nums array in reverse order (5, 4, 3, 2, 1)
    private static void fillNums() {
        for (int i = 0; i < nums.length; ++i) {
            nums[i] = nums.length - i;
        }
    }

    // Fills the floats array uniformly (5.0f, 5.0f, 5.0f, 5.0f, 5.0f).
    private static void fillFloats() {
        for (int i = 0; i < floats.length; ++i) {
            // Explicit cast not necessary, but helps with readability
            floats[i] = (float) floats.length;
        }
    }

    // Prints the nums array.
    private static void printNums() {
        for (int i = 0; i < nums.length; ++i) {
            System.out.println(nums[i]);
        }
    }

    // Prints the floats array.
    private static void printFloats() {
        for (int i = 0; i < floats.length; ++i) {
            System.out.println(floats[i]);
        }
    }

    // Multiplies all the nums together
    private static void multNums() {
        int product = 1;
        for (int i = 0; i < nums.length; ++i) {
            product *= nums[i];
        }
        System.out.println(product);

    }

}
