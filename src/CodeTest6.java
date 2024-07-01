import java.util.Arrays;

public class CodeTest6 {

    public static int solution(int[] num_list) {
        int answer = 0;

        int allDiv = Arrays.stream(num_list).reduce(1,(a,b) -> a*b);

        System.out.println("allDiv >> " + allDiv);

        int allPlus = Arrays.stream(num_list).sum();

        System.out.println("allPlus >> " + allDiv);

        answer = allDiv > (allPlus*allPlus) ? 0 : 1;

        return answer;
    }

}
