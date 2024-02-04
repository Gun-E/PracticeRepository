package org.example.test.practice;

import java.util.Arrays;
import java.util.Objects;

public class Practice3 {
    static public int solution(String[] friends, String[] gifts) {
        int[][] giveAndTakeCount = new int[friends.length][friends.length];

        //주고 받은 선물 카운트
        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                for (int k = 0; k < gifts.length; k++) {
                    String[] member = gifts[k].split(" ");
                    if (Objects.equals(friends[i], member[0]) && Objects.equals(friends[j], member[1])) {
                        giveAndTakeCount[i][j]++;
                    }
                    if (i == j) {
                        giveAndTakeCount[i][j] = -1;
                    }
                }
            }
        }
        //선물 지수 측정
        int givenCount[] = new int[friends.length];
        int takenCount[] = new int[friends.length];
        int bestMember[] = new int[friends.length];

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < gifts.length; j++) {
                String[] member = gifts[j].split(" ");
                if (Objects.equals(friends[i], member[0])) {
                    givenCount[i]++;
                }
                if (Objects.equals(friends[i], member[1])) {
                    takenCount[i]++;
                }
            }
        }

        for (int i = 0; i < bestMember.length; i++) {
            bestMember[i] = givenCount[i] - takenCount[i];
        }

        int result[] = new int[friends.length];

        for (int i = 0; i < friends.length; i++) {
            for (int j = 0; j < friends.length; j++) {
                if (giveAndTakeCount[i][j] > giveAndTakeCount[j][i]) {
                    result[i]++;
                } else if (giveAndTakeCount[i][j] == 0 && giveAndTakeCount[j][i] == 0 || giveAndTakeCount[i][j] == giveAndTakeCount[j][i]) {
                    if (bestMember[i] > bestMember[j]) {
                        result[i]++;
                    }
                }
            }
        }

        int answer = 0;
        answer = Arrays.stream(result).max().orElse(0);
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(new String[]{"muzi", "ryan", "frodo", "neo"}, new String[]{"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"}));
    }
}
