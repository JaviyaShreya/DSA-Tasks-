public class P8 {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end)/2;

        while(start<=end){
            mid = (start + end)/2;
            if(target==nums[mid]){
                return mid;
            }
            if(start<=mid){
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
            else {
                if(target>=nums[mid] && target<=nums[end]){
                    start = mid +1;
                }
                else{
                    end = mid -1;
                }

            }
            
        
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;
        P8 solution = new P8();
        System.out.println(solution.search(nums, target));
    }
} 

//The time complexity : O(log n)

//The space complexity : O(1)



