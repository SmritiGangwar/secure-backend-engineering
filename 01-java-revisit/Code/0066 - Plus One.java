/*#Approach
        <!-- Describe your approach to solving the problem. -->
The key idea is to add 1 from the last digit and propagate carry forward.
        1. If digit < 9 → increment and return
        1. If digit == 9 → set to 0 and continue
        1. If all digits are 9 → create a new array with leading 1,  as default int values will be all 0's in array so we would only need to add leading [1].
As in previous step, array contains all zeroes if every didgit is 9 in the array.
 */



class Solution {
    public int[] plusOne(int[] digits) {

        for(int i = digits.length-1;i>=0;i--){
            if(digits[i]!=9){       // If digit < 9 → increment and return
                digits[i]++;
                return digits;
            }
            digits[i]=0;            // If digit == 9 → set to 0 and continue
        }
        // If all digits are 9 → create a new array with leading 1.
        int ans[] = new int[digits.length+1];
        ans[0] = 1;
        return ans;
    }
}

