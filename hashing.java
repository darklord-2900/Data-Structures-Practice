import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class hashing {
    public static void main(String[] args) {
        HashMap<String,Integer> stu=new HashMap<String,Integer>();
        stu.put("priya", 3);
        stu.put("priyam", 5);
        stu.put("preet", 4);
        Set<String> data=stu.keySet();
        for (String i : data) {
            System.out.println(stu.get(i));
            System.out.println(i.hashCode());
        }
        Set<Map.Entry<String,Integer>> data1=stu.entrySet();
        for (Map.Entry<String,Integer> i : data1) {
            System.out.println(i.getKey()+" "+i.getValue());          
        }
    }
}