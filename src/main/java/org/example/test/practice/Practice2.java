package org.example.test.practice;

import java.util.Arrays;

public class Practice2 {
    static public int[] solution(int[] num_list) {
        int answer =0;
        if(num_list[num_list.length-1]>num_list[num_list.length-2]){
            answer = num_list[num_list.length-1]-num_list[num_list.length-2];
        }
        else  answer = num_list[num_list.length-1]*2;
        int[] resultArray = new int[num_list.length + 1];

        System.arraycopy(num_list, 0, resultArray, 0, num_list.length);

        resultArray[num_list.length] = answer;
        return resultArray;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 6}));
        System.out.println(solution(new int[]{5, 2, 1, 7, 5}));
    }
}
