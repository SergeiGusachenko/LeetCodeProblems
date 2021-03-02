package 1342. Number of Steps to Reduce a Number to Zero;

public class 1342. Number of Steps to Reduce a Number to Zero {
	public static int numberOfSteps (int num) {
        result++;
        if(num == 0)
            return 0;
        if(num % 2 == 0)
            numberOfSteps(num/2);
        else
            numberOfSteps(num - 1);
        return result;
    }

	/// Using bitwise operations

	public static int numberOfSteps (int num) {
        int result = 0;
        while(num > 0){
            int i = num & 1;
            if(i == 1  && num > 1)
                result += 2;
            else
                result+= 1;
            num = num >> 1;
        }
        return result;
    }
}
