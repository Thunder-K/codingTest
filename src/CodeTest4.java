public class CodeTest4 {

    public static int[] solution(int[] num_list) {
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

}

