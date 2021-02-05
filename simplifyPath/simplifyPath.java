package simplifyPath;

public class simplifyPath {
	public static String simplifyPath(String path) {
        StringBuilder res = new StringBuilder();
       path = path.replace("//", "/");
        String [] directories = path.split("/");
        List<String> result = new ArrayList<>();
        int j =0;
        for (int i = 1; i < directories.length; i++){
            if(directories[i].equals("."))
                continue;
            else if(directories[i].equals("..") && i != 1){
                if(j - 1  < 0){
                    result.clear();
                    j = 0;
                }
                else{
                    result.remove(result.size() - 1);
                    j--;
                }
            }else if(!directories[i].isEmpty()){
                if(!directories[i].equals("..")){
                    result.add(directories[i]);
                    j++;
                }
            }
        }
        for(String e : result){
            res.append('/');
            res.append(e);
        }
        if(res.length() == 0)
            res.append('/');
        return res.toString();
    }
}
