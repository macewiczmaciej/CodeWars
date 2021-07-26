public class HighestAndLowest {
    public static String highAndLow(String numbers) {
        int min = 0;
        int max = 0;
        String[] array = numbers.split("\\s");
        int size = array.length;
        int[] nums = new int [size];
        for (int i = 0; i < array.length; i++) {
            nums[i] = Integer.parseInt(array[i]);
        }
        min = nums[0];
        max = nums[0];
        for (int num : nums) {
            if(num>max){
                max = num;
            }
            if(num<min){
                min = num;
            }
        }
        return max+" "+min;
    }
}