import java.util.Scanner;



class Solution {
    

    public int[] runningSum(int[] nums) {

        int[] array = new int[nums.length];
        int sum =0;
        
        for(int i=0; i<nums.length; i++) {
            sum += nums[i];
            array[i] = sum;
            
        }
        return array;
    }


}




class Main {

    public static void main(String[] args) {

        Solution sol = new Solution();

        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("enter the number of elements of the array: ");
            int N = scan.nextInt();

            int[] array = new int[N];

            for(int i=0; i<N; i++) {
                array[i] = scan.nextInt();
            }

            int[] newArray = sol.runningSum(array);

            System.out.println(newArray);
        }
    }

}
