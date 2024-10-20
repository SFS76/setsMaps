import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        System.out.println("task 1");
        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        System.out.println("task 2");
        Collections.sort(nums);
        int prevNum = Integer.MIN_VALUE;
        for (Integer num : nums) {
            if (num % 2 == 0 && num != prevNum) {
                System.out.println(num);
                prevNum = num;
            }
        }

        System.out.println("task 3");
        Set<String> words = new HashSet<>(strings);
        System.out.println(words);

        System.out.println("task 3");
        for (String word : words) {
            int n = 0;
            for (String string : strings) {
               if (string==word) {
                   n++;               }
            }
            System.out.println(word+" повторяется " + n);
        }
    }
}