package org.example.test.practice;


public class Practice1 {

    public static void main(String[] args) {
        int num_list[] = {3, 4, 5, 2, 1};
        int result1 = 0;
        int result2 = 0;
        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 != 0) {
                result1 *= 10;
                result1 += num_list[i];
            } else {
                result2 *= 10;
                result2 += num_list[i];
            }
        }
        System.out.println(result1 + result2);
    }
}
