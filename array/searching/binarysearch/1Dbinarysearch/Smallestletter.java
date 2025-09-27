// * The array is considered circular, so if the target is greater than or equal to the last character,
//  * the function returns the first character in the array.
//  *
//  * @param letters A sorted array of lowercase letters.
//  * @param target The target lowercase letter.
//  * @return The smallest character in the array that is strictly greater than the target.
//  */

public class Smallestletter {
    public static void main(String[] args) {
        char[] c = { 'c', 'f', 'j' };
        char t = 'a';
        char res = nextGreatestLetters(c, t);
        System.out.println(res);
    }

    static char nextGreatestLetters(char[] letters, char target) {
        int start = 0;
        int last = letters.length - 1;
        while (start <= last) {
            int mid = start + (last - start) / 2;
            if (letters[mid] > target) {
                last = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start % letters.length];
    }
}
