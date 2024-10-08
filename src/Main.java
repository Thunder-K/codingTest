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

        System.out.println("문자열로 변환");
        System.out.println(CodeTestLv0.solution13(123));

        System.out.println("문자열을 정수로 변환하기");
        System.out.println(CodeTestLv0.solution14("10"));

        System.out.println("문자열 정수의 합");
        System.out.println(CodeTestLv0.solution15("123456789"));

        System.out.println("뒤에서 5등 위로");
        System.out.println(Arrays.toString(CodeTestLv0.solution16(new int[]{12, 4, 15, 46, 38, 1, 14, 56, 32, 10})));

        System.out.println("뒤에서 5등까지");
        System.out.println(Arrays.toString(CodeTestLv0.solution17(new int[]{12, 4, 15, 46, 38, 1, 14})));

        System.out.println("배열 비교하기");
        System.out.println(CodeTestLv0.solution18(new int[]{100, 17, 84, 1},new int[]{55, 12, 65, 36}));

        System.out.println("배열의 원소만큼 추가하기");
        System.out.println(Arrays.toString(CodeTestLv0.solution19(new int[]{5, 1, 4})));

        System.out.println("rny_string");
        System.out.println(CodeTestLv0.solution20("masterpiece"));

        System.out.println("문자열 바꿔서 찾기");
        System.out.println(CodeTestLv0.solution21("ABBAA", "AABB"));

        System.out.println("공백으로 구분하기 2");
        System.out.println(Arrays.toString(CodeTestLv0.solution22("i    love  you")));

        System.out.println("공백으로 구분하기 1");
        System.out.println(Arrays.toString(CodeTestLv0.solution23("i love you")));

        System.out.println("특정한 문자를 대문자로 바꾸기");
        System.out.println(CodeTestLv0.solution24("programmers", "p"));

        System.out.println("A 강조하기");
        System.out.println(CodeTestLv0.solution25("abstract algebra"));

        System.out.println("배열에서 문자열 대소문자 변환하기");
        System.out.println(Arrays.toString(CodeTestLv0.solution26(new String[]{"AAA","BBB","CCC","DDD"})));

        System.out.println("소문자로 바꾸기");
        System.out.println(CodeTestLv0.solution27("aBcDeFg"));

        System.out.println("n의 배수");
        System.out.println(CodeTestLv0.solution28(98, 2));


        System.out.println("대문자로 바꾸기");
        System.out.println(CodeTestLv0.solution29("aBcDeFg"));

        System.out.println("원하는 문자열 찾기");
        System.out.println(CodeTestLv0.solution30("AbCdEfG","aBc"));

        System.out.println("길이에 따른 연산");
        System.out.println(CodeTestLv0.solution31(new int[]{3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1}));

        System.out.println("조건에 맞게 수열 변환하기 1");
        System.out.println(Arrays.toString(CodeTestLv0.solution32(new int[]{1, 2, 3, 100, 99, 98})));


        System.out.println("n보다 커질 때까지 더하기");
        System.out.println(CodeTestLv0.solution33(new int[]{34, 5, 71, 29, 100, 34},123));

        System.out.println("5명씩");
        System.out.println(Arrays.toString(CodeTestLv0.solution34(new String[]{"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx", "nami2", "ahri2", "jayce2"})));

        System.out.println("n개 간격의 원소들");
        System.out.println(Arrays.toString(CodeTestLv0.solution35(new int[]{4, 2, 6, 1, 7, 6}, 4)));

        System.out.println("n 번째 원소까지");
        System.out.println(Arrays.toString(CodeTestLv0.solution36(new int[]{2, 1, 6}, 1)));

        System.out.println("순서 바꾸기");
        System.out.println(Arrays.toString(CodeTestLv0.solution37(new int[]{5, 2, 1, 7, 5}, 3)));

        System.out.println("n 번째 원소부터");
        System.out.println(Arrays.toString(CodeTestLv0.solution38(new int[]{5, 2, 1, 7, 5}, 2)));

    }


}
