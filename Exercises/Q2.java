package Exercises;

// Leaders in an Array
import java.util.*;

// Brute Force Approach
/* 
class Answer {
    public List<Integer> leadersInArray(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;
        for(int i=0; i<n; i++) {
            boolean isleader = true;
            for(int j=i+1; j<n; j++) {
                if(nums[j] > nums[i]) {
                    isleader = false;
                }
            }
            if(isleader) {
                leaders.add(nums[i]);
            }
        }
        return leaders;
    }
} 

Time Complexity: O(N²), where N represents the array size. Every candidate may require comparison with every remaining element on its right.
Space Complexity: O(1) auxiliary space, because only loop variables and a Boolean flag are required. The returned list is excluded from auxiliary-space analysis.
*/

// Better approach
/* 
class Answer {
    public List<Integer> leadersInArray(int[] nums) {
        int n = nums.length;

        if(n == 0) {
            return new ArrayList<>();
        }

        int[] suffixMax = new int[n];
        suffixMax[n - 1] = nums[n - 1]; 

        for(int i=n-2; i>0; i--) {
            suffixMax[i] = Math.max(nums[i], suffixMax[i + 1]);
        }
        List<Integer> leaders = new ArrayList<>();
        for(int i=0; i<n-1; i++) {
            if(nums[i] >= suffixMax[i + 1]) {
                leaders.add(nums[i]);
            }
        }
        leaders.add(nums[n - 1]);

        return leaders;
    }
}
Time Complexity: O(N), where N represents the array size. One traversal builds the suffix maximum array, and another traversal collects the leaders.
Space Complexity: O(N), because suffixMax stores one value for every array position. The returned list is excluded from auxiliary-space analysis.
*/

// Optimal Approach

class Answer {
    public List<Integer> leadersInArray(int[] nums) {
        int n = nums.length;

        if(n == 0) {
            return new ArrayList<>();
        }

        List<Integer> leaders = new ArrayList<>();
        int maxRight = nums[n - 1];

        leaders.add(nums[n - 1]);
        for(int i = n-2; i>=0; i--) {
            if(nums[i] >= maxRight) {
                leaders.add(nums[i]);
            }
            maxRight = Math.max(maxRight, nums[i]);
        }
        Collections.reverse(leaders);
        return leaders;
    }
}
// Time Complexity: O(N), where N represents the array size. One right-to-left traversal identifies the leaders, and reversing the collected list requires at most O(N) time.
// Space Complexity: O(1) auxiliary space, because only maxRight and loop variables require extra storage. The returned list is excluded from auxiliary-space analysis.

public class Q2 {
    public static void main(String[] args) {
        int[] nums = {10, 22, 12, 9, 0, 6};

        Answer solution = new Answer();
        List<Integer> leaders = solution.leadersInArray(nums);

        for(int value: leaders) {
            System.out.print(value+ " ");
        }

    }
}
