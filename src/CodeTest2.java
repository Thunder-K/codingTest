import java.util.ArrayList;
import java.util.List;

public class CodeTest2 {

    public static int[] solution(int start_num, int end_num) {
        int[] answer = {};

        List<Integer> intList = new ArrayList<>();

        for(int i = start_num; i <= end_num; i++) {

            intList.add(i);

        }
        answer = intList.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

}
