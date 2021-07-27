import java.util.Arrays;
import java.util.List;

public class Order {
    public static String order(String words) {
        if(words.equals("")){
            return "";
        }else{
            String[] array = words.split("\\s");
            Integer[] nums = new Integer[array.length];
            String[] ordered = new String[array.length];
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < array.length; i++) {
                int x = Integer.parseInt(array[i].replaceAll("\\D", ""));
                nums[i]=x-1;
            }
            List<Integer> list = Arrays.asList(nums);
            for (int i = 0; i < ordered.length; i++) {
                ordered[i] = array[list.indexOf(i)];
            }
            for (String s : ordered) {
                result.append(s).append(" ");
            }
            return result.toString().trim();
        }
    }
}