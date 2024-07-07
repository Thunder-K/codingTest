import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println("공배수");
        System.out.println(CodeTestLv0.solution1(60,2,3));

        System.out.println("카운트 업");
        System.out.println(Arrays.toString(CodeTestLv0.solution2(3, 10)));

        System.out.println("수 조작하기 1");
        System.out.println(CodeTestLv0.solution3(0, "wsdawsdassw"));

        System.out.println("마지막 두 원소");
        System.out.println(Arrays.toString(CodeTestLv0.solution4(new int[]{2, 1, 6})));

        System.out.println("이어 붙인 수");
        System.out.println(CodeTestLv0.solution5(new int[]{3,4,5,2,1}));

        System.out.println("원소들의 곱과 합");
        System.out.println(CodeTestLv0.solution6(new int[]{5, 7, 8, 3}));

        System.out.println("flag에 따라 다른 값 반환하기");
        System.out.println(CodeTestLv0.solution7(-4, 7, true));

        System.out.println("홀짝에 따라 다른 값 반환하기");
        System.out.println(CodeTestLv0.solution8(7));

        System.out.println("조건에 맞게 수열 변환하기 3");
        System.out.println(Arrays.toString(CodeTestLv0.solution9(new int[]{1, 2, 3, 100, 99, 98}, 3)));

        System.out.println("정수 찾기");
        System.out.println(CodeTestLv0.solution10(new int[]{1, 2, 3, 4, 5}, 3));

        System.out.println("부분 문자열");
        System.out.println(CodeTestLv0.solution11("abc", "aabcc"));

        System.out.println("부분 문자열인지 확인하기");
        System.out.println(CodeTestLv0.solution12("banana", "ana"));

    }

}
