package 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K;

public class 1414. Find the Minimum Number of Fibonacci Numbers Whose Sum Is K {
	public static int numberOfTimes = 0;
    public static int getNumber(int k){
        if(k == 0)
            return 0;
        numberOfTimes++;
        if(k == 2)
            return 2;
        int f1 = 1;
        int f2 = 1;
        int fn = 1;
        while(f1 + f2 < k && k > 2)
        {
            fn = f1 + f2;
            f2 =  f1;
            f1 = fn;
            if(f1 + f2 == k)
                return k;
        }
        return fn;
    }

    public static int findMinFibonacciNumbers(int k) {
        while(k > 0){
            k -= getNumber(k);
        }

        return numberOfTimes;
    }
}
