package Exercises;

// Highest Occurring Element in an Array
// Brute force 
// Time Complexity: O(N2), where N is the size of the array. For each element, the entire array is traversed once, resulting in N × N operations.
// Space Complexity: O(1), because only the current count and best answer are stored apart from the input.
import java.util.*;

/* 
class Solution {

    // Returns the most frequent element in the array.
    public int mostFrequentElement(int[] arr) {

        // If the array is empty, there is no answer.
        if (arr.length == 0) {
            return -1;
        }

        int answer = arr[0];
        int maxFrequency = 0;

        // Check every element in the array.
        for (int i = 0; i < arr.length; i++) {
            int currentFrequency = 0;

            // Count the frequency of the current element.
            for (int j = 0; j < arr.length; j++) {

                // If both elements are equal, increment the frequency.
                if (arr[j] == arr[i]) {
                    currentFrequency++;
                }
            }

                    // Update the answer if the current
                    // element is a better candidate.    
                if (currentFrequency > maxFrequency ||
                (currentFrequency == maxFrequency && arr[i] < answer)) {
                maxFrequency = currentFrequency;
                answer = arr[i];
            }
        }

        return answer;
    }
}
*/

public class Q1 {

    // Driver Code starts
    public static void main(String[] args) {
        int[] arr = {4, 1, 4, 2, 1};

        Solution solution = new Solution();

        // Call the function to find the most frequent element.
        int answer = solution.mostFrequentElement(arr);

        System.out.println(answer);
    }
}

// Better approach
// Time Complexity: O(N log(N)), where N is the size of the array. The sorting operation takes O(N log(N)) time and dominates the overall complexity.
// Space Complexity: O(1), because any extra space is not used.

/* 
class Solution {
 
    // Returns the most frequent element in the array.
    public int mostFrequentElement(int[] arr) {
 
        // If the array is empty, there is no answer.
        if (arr.length == 0) {
            return -1;
        }
 
        // Sort the array so that duplicate values become adjacent.
        Arrays.sort(arr);
 
        int answer = arr[0];
        int maxFrequency = 0;
        int start = 0;
 
        // Process one group of equal elements at a time.
        while (start < arr.length) {
            int end = start;
 
            // Extend the current group while the values remain the same.
            while (end < arr.length &&
                   arr[end] == arr[start]) {
                end++;
            }
 
            // Calculate the size of the current group.
            int currentFrequency = end - start;
            int currentValue = arr[start];

            if (currentFrequency > maxFrequency ||
                (currentFrequency == maxFrequency && currentValue < answer)) {
                maxFrequency = currentFrequency;
                answer = currentValue;
            }
 
            // Move to the beginning of the next group.
            start = end;
        }
 
        return answer;
    }
}
    */

// Optimal Approach
// Time Complexity: O(N) on average, where N is the number of elements in the array, because every element is processed once and each hash-map update takes average O(1) time. In the worst-case scenario, frequent collisions can significantly slow down operations.
// Space Complexity: O(K), where K is the number of distinct values stored in the frequency map. At the worst-case the hash-map can contain all the N elements, so worst case space complexity is O(N).

class Solution {
    public int mostFrequentElement(int[] nums) {
        if(nums.length == 0) {
            return -1;
        }
        HashMap<Integer, Integer> frequency = new HashMap<>();
        int maxFreq = 0;
        int answer = nums[0];
        for(int value: nums) {
            int currFreq = frequency.getOrDefault(value, 0) + 1;
            frequency.put(value, currFreq);

            if(currFreq > maxFreq || currFreq == maxFreq && value < answer) {
                maxFreq = currFreq;
                answer = value;
            }
        }
        return answer;
    }    
}




