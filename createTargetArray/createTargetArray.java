
    public static int[] moveToOneForward(int[] array, int j){
        for(int i = array.length - 1; i > j; i--){
            array[i] = array[i - 1];
        }
        return array;
    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        int []result = new int[index.length];

        for(int i = 0; i < nums.length; i++){
            if(index[i] == i)
                result[index[i]] = nums[i];
            else{
                moveToOneForward(result, index[i]);
                result[index[i]] = nums[i];
            }
        }
        return result;
    }