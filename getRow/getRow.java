package getRow;

public class getRow {


	private static long getFactorial(long num){
		long result = 1;
		for(long i = 1; i <= num; i++)
			result *= i;

		return result;
	}

	public static List<Integer> getRow(int rowIndex) {

		List<Integer> result = new ArrayList<>(rowIndex + 1);
		 var res = new ArrayList<List<Integer>>();
		 long RowValue = getFactorial(rowIndex);
		 int k = 2;
		result.add(1);
		if(rowIndex > 20){
			result = getRow(20);
			res.add(result);

		 for(int i = 21; i <= rowIndex; i++){
			 var list = new ArrayList<Integer>(i);
			 list.add(1);
			 for(int j = 1; j < i; j++){
				 var prevRow = res.get(k - 2);
				 list.add(prevRow.get(j - 1) + prevRow.get(j));

			 }
			 k++;
			 list.add(1);
			 res.add(list);
			  if(rowIndex == i)
				  return list;
		 }
		}   else {
			for (int i = 1; i < rowIndex; i++) {
				long CurrentCellValue = RowValue / (getFactorial(rowIndex - i) * getFactorial(i));
				result.add(Math.toIntExact(CurrentCellValue));
			}
		}
		if(rowIndex > 0)
		result.add(1);

		return result;
	}
}
