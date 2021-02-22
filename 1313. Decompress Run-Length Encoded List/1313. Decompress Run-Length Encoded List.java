package 1313. Decompress Run-Length Encoded List;

public class 1313. Decompress Run-Length Encoded List {
	public static int[] decompressRLElist(int[] nums) {
        int size = 0;
        for(int i = 0; i < nums.length; i+= 2){
            size = size + nums[i];
        }
        int[] res = new int[size];
        int i = 0;
        for(int j = 0; j < nums.length; j += 2){
            int a = nums[j];
            int b = nums[j + 1];
            while(a >= 1)
            {
                a--;
                res[i] = b;
                i++;
            }
        }
        return res;
    }
}
