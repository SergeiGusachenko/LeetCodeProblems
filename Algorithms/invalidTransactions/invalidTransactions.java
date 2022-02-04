package invalidTransactions;

public class invalidTransactions {
    public static List<String> invalidTransactions(String[] transactions) {
        boolean [] check = new boolean[transactions.length];
        List<String> result = new ArrayList<>();
        for(int i = 0; i < transactions.length; i++){
            String [] v1 = transactions[i].split(",");
            if(Integer.parseInt(v1[2]) > 1000){
                if(!check[i]){
                    result.add(transactions[i]);
                    check[i] = true;
                }
            }
            for(int j = i + 1; j < transactions.length; j++){
                String [] v2 = transactions[j].split(",");
                if(Integer.parseInt(v2[2]) > 1000){
                    if(!check[j]){
                        result.add(transactions[j]);
                        check[j] = true;
                    }
                }
                if(v1[0].equals(v2[0]) && !v1[3].equals(v2[3]) && Math.abs(Integer.parseInt(v1[1]) - Integer.parseInt(v2[1])) <= 60)
                {
                  if(!check[i]){
                      check[i] = true;
                      result.add(transactions[i]);
                  }
                    if(!check[j]){
                        check[j] = true;
                        result.add(transactions[j]);
                    }
                }

            }
        }
        return result;
    }
}
