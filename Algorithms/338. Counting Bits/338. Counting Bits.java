package 338. Counting Bits;

public class 338. Counting Bits {
	public static int[] countBits(int num) {
        int [] nums = new int[num + 1];
        int power = 4;
        nums[0] = 0;
        nums[1] = 1;
        for(int i = 2; i <= num; i++){
            if(i == power){
                nums[power] = 1;
                power *= 2;
            }
            else if(i % 2 == 0)
                nums[i] = nums[i/2];
            else
                nums[i] = nums[i - 1] + 1;
        }
        return nums;
    }

}
