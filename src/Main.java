import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("공배수");
        System.out.println(CodeTest.solution(60,2,3));

        System.out.println("카운트 업");
        System.out.println(Arrays.toString(CodeTest2.solution(3, 10)));

        System.out.println("수 조작하기 1");
        System.out.println(CodeTest3.solution(0, "wsdawsdassw"));

        System.out.println("마지막 두 원소");
        System.out.println(Arrays.toString(CodeTest4.solution(new int[]{2, 1, 6})));

        System.out.println("이어 붙인 수");
        System.out.println(CodeTest5.solution(new int[]{3,4,5,2,1}));

        System.out.println("원소들의 곱과 합");
        System.out.println(CodeTest6.solution(new int[]{5, 7, 8, 3}));

        System.out.println("flag에 따라 다른 값 반환하기");
        System.out.println(CodeTest7.solution(-4, 7, true));

        System.out.println("홀짝에 따라 다른 값 반환하기");
        System.out.println(CodeTest8.solution(7));

    }

}
