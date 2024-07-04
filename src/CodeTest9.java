import java.util.Arrays;

public class CodeTest9 {

    public static int[] solution(int[] arr, int k) {
        int[] answer = {};

        answer = Arrays.stream(arr).map(i -> k % 2 != 0 ? i * k : i + k).toArray();

        return answer;
    }

}
