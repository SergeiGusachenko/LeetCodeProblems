package generate;

public class generate {
	public static List<List<Integer>> generate(int numRows) {
		var res = new ArrayList<List<Integer>>();
		if (numRows > 0)
			res.add(Collections.singletonList(1));

		for (int i = 2; i <= numRows; i++) {
			var list = new ArrayList<Integer>(i);
			list.add(1);
			for (int j = 1; j < i - 1; j++) {
				var prevRow = res.get(i - 2);
				list.add(prevRow.get(j - 1) + prevRow.get(j));
			}
			list.add(1);
			res.add(list);
		}
		return res;
}
