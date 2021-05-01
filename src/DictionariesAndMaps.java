import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DictionariesAndMaps {
    public static void main(String[] args) {
        Map<String,Integer> list = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            list.put(name,phone);
        }
        Set<String> keys = list.keySet();
        while(in.hasNext()){
            String s = in.next();
            if(keys.contains(s)){
                System.out.println(s + "=" + list.get(s));
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
