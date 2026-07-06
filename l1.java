 public class l1 {
    public static  void main (String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
    public static int[] sortedSquares (int [] nums) {
        int left = 0;
        int n = nums.length;
        int right =n-1;
        int[] result= new int [nums.length];
        for (int i=n-1;i>=0;i--){
            int leftSqr=nums[left]*nums[left];
            int rightSqr=nums[right]*nums[right];
            if(leftSqr>rightSqr){
                result[i]=leftSqr;
                left++;
            }
            else{
                result[i]=rightSqr;
                right--;
            }
        }
        return  result;
    }
}
