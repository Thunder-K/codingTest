import java.util.Arrays;
import java.util.stream.Collectors;

public class CodeTest5 {

    public static int solution(int[] num_list) {
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

}
