import java.util.ArrayList;
import java.util.List;

public class CodeTest {

    public static int solution(int number, int n, int m) {

        int nCheck = number % n == 0 ? 1 : 0;
        int mCheck = number % m == 0 ? 1 : 0;

        return nCheck*mCheck;
    }

}
