package org.example.test.practice;

public class Practice4 {
    public static void main(String[] args) {
        Practice4 p = new Practice4();
        System.out.println(p.solution("abc", "aabcc"));
        System.out.println(p.solution("tbt", "tbbttb"));
    }

    public int solution(String str1, String str2) {
        if (str2.contains(str1)) return 1;
        return 0;
    }
}
