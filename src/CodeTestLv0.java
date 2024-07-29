import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CodeTestLv0 {

    public static int solution1(int number, int n, int m) {

        int nCheck = number % n == 0 ? 1 : 0;
        int mCheck = number % m == 0 ? 1 : 0;

        return nCheck*mCheck;
    }

    public static int[] solution2(int start_num, int end_num) {
        int[] answer = {};

        List<Integer> intList = new ArrayList<>();

        for(int i = start_num; i <= end_num; i++) {

            intList.add(i);

        }
        answer = intList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

    public static int solution3(int n, String control) {
        int answer = 0;

        char[] arr = control.toCharArray();

        for (char c : arr) {
            if (c == 'w')
                n += 1;
            else if (c == 's')
                n -= 1;
            else if (c == 'd')
                n += 10;
            else if (c == 'a')
                n -= 10;
        }

        answer = n;

        return answer;
    }

    public static int[] solution4(int[] num_list) {
        int[] answer = {};

        int lastIndex = num_list.length - 1;
        int lastValue = 0;
        int[] add_num_list = new int[lastIndex + 2];

        if(num_list[lastIndex] > num_list[lastIndex-1])
            lastValue = num_list[lastIndex] - num_list[lastIndex-1];
        else
            lastValue = num_list[lastIndex] * 2;

        int arr_num_list_index = 0;

        for(int i : num_list) {
            add_num_list[arr_num_list_index] = i;
            arr_num_list_index++;
        }
        add_num_list[add_num_list.length-1] = lastValue;

        answer = add_num_list;

        return answer;
    }

    public static int solution5(int[] num_list) {
        int answer = 0;

        String oddStr = Arrays.stream(num_list)
                .filter(x -> x % 2 != 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        String evenStr = Arrays.stream(num_list)
                .filter(x -> x % 2 == 0)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining());

        int oddNumber = oddStr.isEmpty() ? 0 : Integer.parseInt(oddStr);
        int evenNumber = evenStr.isEmpty() ? 0 : Integer.parseInt(evenStr);

        answer = oddNumber + evenNumber;

        return answer;
    }

    public static int solution6(int[] num_list) {
        int answer = 0;

        int allDiv = Arrays.stream(num_list).reduce(1,(a,b) -> a*b);

        System.out.println("allDiv >> " + allDiv);

        int allPlus = Arrays.stream(num_list).sum();

        System.out.println("allPlus >> " + allDiv);

        answer = allDiv > (allPlus*allPlus) ? 0 : 1;

        return answer;
    }

    public static int solution7(int a, int b, boolean flag) {
        int answer = 0;



        return (flag ? a+b : a-b);
    }

    public static int solution8(int n) {
        int answer = 0;

        if(n % 2 == 0) {

            for(int i = 2; i <= n; i+=2) {
                answer += (int) Math.pow(i, 2);
            }

        } else {

            for(int i = 1; i <= n; i+=2) {
                answer += i;
            }

        }



        return answer;
    }

    public static int[] solution9(int[] arr, int k) {
        int[] answer = {};

        answer = Arrays.stream(arr).map(i -> k % 2 != 0 ? i * k : i + k).toArray();

        return answer;
    }

    public static int solution10(int[] num_list, int n) {
        int answer = 0;

        answer = Arrays.stream(num_list).anyMatch(i -> i == n) ? 1 : 0;

        return answer;
    }

    public static int solution11(String str1, String str2) {
        int answer = 0;

        answer = (str2.contains(str1) ? 1 : 0);

        return answer;
    }

    public static int solution12(String my_string, String target) {
        int answer = 0;

        answer = (my_string.contains(target) ? 1 : 0);

        return answer;
    }

    public static String solution13(int n) {
        String answer = "";

        answer = String.valueOf(n);

        return answer;
    }

    public static int solution14(String n_str) {
        int answer = 0;

        answer = Integer.parseInt(n_str);

        return answer;
    }

    public static int solution15(String num_str) {
        int answer = 0;

        int sum = 0;
        for (int i = 0; i < num_str.length(); i++) {

            sum += Integer.parseInt(String.valueOf(num_str.charAt(i)));
        }
        answer = sum;

        return answer;
    }

    public static int solution16(double flo) {
        int answer = 0;

        answer = (int) flo;

        return answer;
    }

    public static int[] solution16(int[] num_list) {
        int[] answer = {};

        Arrays.sort(num_list);

        answer = Arrays.copyOfRange(num_list, 5, num_list.length);

        return answer;
    }

    public static int[] solution17(int[] num_list) {
        int[] answer = {};

        answer = Arrays.stream(num_list).sorted().toArray();

        answer = Arrays.copyOfRange(answer, 0, 5);

        return answer;
    }

    public static int solution18(int[] arr1, int[] arr2) {
        int answer = 0;

        if(arr1.length > arr2.length || arr1.length < arr2.length) {

            return answer = arr1.length > arr2.length ? 1 : -1;

        } else {

            int arr1Sum = Arrays.stream(arr1).sum();
            int arr2Sum = Arrays.stream(arr2).sum();

            return answer = arr1Sum == arr2Sum ? 0 : arr1Sum > arr2Sum ? 1 : -1;

        }


    }

    public static int[] solution19(int[] arr) {
        int[] answer = {};

        int [] resultArr = new int[Arrays.stream(arr).sum()];

        int index = 0;
        int arrVal = 0;

        for(int k = 0; k < resultArr.length; k++) {

            if(arr[index] > arrVal) {

                resultArr[k] = arr[index];

                arrVal++;

            } else {
                index ++;

                resultArr[k] = arr[index];

                arrVal = 1;
            }

        }

        answer = resultArr;

        return answer;
    }

    public static String solution20(String rny_string) {
        String answer = "";

        answer = rny_string.replace("m", "rn");

        return answer;
    }

    public static int solution21(String myString, String pat) {
        int answer = 0;

        return answer = myString.chars()
                .mapToObj(i -> (char) i)
                .map(i -> i.equals('A') ? 'B' : 'A')
                .map(String::valueOf)
                .collect(Collectors.joining())
                .contains(pat) ? 1 : 0;

    }

    public static String[] solution22(String my_string) {
        String[] answer = {};

        return answer = Arrays.stream(my_string.split(" ")).filter(i -> !i.isEmpty()).toArray(String[]::new);
    }

    public static String[] solution23(String my_string) {
        String[] answer = {};

        return answer = Arrays.stream(my_string.split(" ")).toArray(String[]::new);
    }

    public static String solution24(String my_string, String alp) {
        String answer = "";

        return answer = Stream.of(my_string.split("")).map(i -> i.equals(alp) ? i.toUpperCase() : i).collect(Collectors.joining());
    }

    public static String solution25(String myString) {
        String answer = "";
        return answer = Stream.of(myString.split(""))
                .map(i -> i.equals("a") ? i.toUpperCase() : i.equals("A") ? i : i.toLowerCase())
                .collect(Collectors.joining());
    }

    public static String[] solution26(String[] strArr) {
        String[] answer = {};

        for(int i = 0; i < strArr.length; i++) {

            if(i % 2 == 0) {
                strArr[i] = strArr[i].toLowerCase();
            } else {
                strArr[i] = strArr[i].toUpperCase();
            }

        }

        return answer = strArr;
    }
}
