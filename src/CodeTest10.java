import java.util.Arrays;
import java.util.Collections;

public class CodeTest10 {

    public static int solution(int[] num_list, int n) {
        int answer = 0;

        answer = Arrays.stream(num_list).anyMatch(i -> i == n) ? 1 : 0;

        return answer;
    }

}
