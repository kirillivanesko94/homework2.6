
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> text = new ArrayList<>(List.of("Привет", "Привет", "Привет", "Пока", "Пока", "Пока"));
        task1(nums);
        task2(nums);
        task3(text);
        task4(text);

    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (!isEven(num)) {
                System.out.println(num);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        Set<Integer> numsSet = new HashSet<>();
        for (Integer numbers : nums) {
            if (isEven(numbers)) {
                numsSet.add(numbers);
            }
        }
        System.out.println(numsSet);
    }

    public static void task3(List<String> str) {
        Set<String> textSet = new HashSet<>(str);
        System.out.println(textSet);
    }

    public static void task4(List<String> str) {
        int count = 0;
        int count2 = 0;
        for (String text : str) {
            if (str.contains(text)) {
                count++;
            }
        }
        Set<String> textSet = new HashSet<>(str);
        for (String text2 : textSet) {
            count2++;
        }
        System.out.println(count - count2);
    }

    public static boolean isEven(Integer nums) {
        return nums % 2 == 0;
    }
}