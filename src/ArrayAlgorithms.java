public class ArrayAlgorithms {
    /** Changes the first and last element of nums to be num
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: nums.length > 0
     */
    public static void bookEnd(int[] nums, int num) {
        nums[0] = num;
        nums[nums.length - 1] = num;
    }
    /** Multiplies each number in numList by multiplier.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void multiplyBy(int[] numList, int multiplier) {
        int i = 0;
        for (i = 0; i < numList.length; i++) {
            numList[i] *= multiplier;
        }
    }
    /** Returns an array of ints where each element is the product
     *  of the corresponding element in numList and multiplier.
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static int[] multiplyByNoModify(int[] numList, int multiplier) {
        int[] newNumList = new int[numList.length];
        int i = 0;
        for (i = 0; i < newNumList.length; i++) {
            newNumList[i] = numList[i] * multiplier;
        }
        return newNumList;
    }
    /** Adds a "!" to the end of each String in wordList.  However, if a
     *  a string already ends in an exclamation point, do NOT add another.
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: wordList.length > 0
     */
    public static void addExclamation(String[] wordList) {
        int i = 0;
        for (i = 0; i < wordList.length; i++) {
            if (!(wordList[i].substring(wordList[i].length() - 1).contains("!"))) {
                wordList[i] += "!";
            }
        }
    }
    /** Returns an array of booleans where each element reflects whether
     *  the corresponding element in tempList is at or below the freezing
     *  temperature of 32 (true) or not (false).
     *
     *  THIS METHOD DOES NOT MUTATE (MODIFY) ORIGINAL ARRAY
     *  PRECONDITION: tempList.length > 0
     */
    public static boolean[] isFreezing(int[] tempList) {
        boolean freezing[] =new boolean[tempList.length];
        int i = 0;
        for (i = 0; i < tempList.length; i++) {
            if (tempList[i] > 32) {
                freezing[i] = false;
            } else {
                freezing[i] = true;
            }
        }
        return freezing;
    }
    /** Shifts all elements in numList to the LEFT one index
     *
     *  The first element in the array should wrap around
     *  to the back of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {1, 3, 4, 7, 6, 5} (all elements shifted left one
     *  with the last element wrapping around to the back)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftLeft(int[] numList) {
        int[] newNumList = numList;
        int j = 0;
        for (int i = 0; i <=numList.length; i++) {

            /*
            if (j > numList.length - 1) {
                numList[i] = newNumList[0];
            } else {
                j = i + 1;
                numList[i] = newNumList[j];
            }

             */
        }
    }
    /** Shifts all elements in numList to the RIGHT one index.
     *
     *  The last element in the array should wrap around
     *  to the front of the array.  For example, given the array
     *  {5, 1, 3, 4, 7, 6}, this method modifies the array
     *  to {6, 5, 1, 3, 4, 7} (all elements shifted right one
     *  with the last element wrapping around to the front)
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void shiftRight(int[] numList) {
        // IMPLEMENT ME
    }
    /** Reverses all elements in an array.
     *
     *  For example, given the array {5, 1, 3, 4, 7, 6}, this method
     *  modifies the array to {6, 7, 4, 3, 1, 5}.
     *  Should work with all array lengths (both odd and even).
     *
     *  THIS METHOD MUTATES (MODIFIES) ORIGINAL ARRAY
     *  PRECONDITION: numList.length > 0
     */
    public static void reverse(int[] numList) {
        // IMPLEMENT ME: You should solve this two different ways; see below
    }
}
