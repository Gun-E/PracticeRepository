package org.example.test.practice;

public class Practice4 {
    public static void main(String[] args) {
        Practice4 p = new Practice4();
        System.out.println(p.solution("abc", "aabcc"));
        System.out.println(p.solution("tbt", "tbbttb"));
    }

    public int solution(String str1, String str2) {
        boolean a = str2.contains(str1);
        int b = a ? 1 : 0;
        return b;
    }
}
