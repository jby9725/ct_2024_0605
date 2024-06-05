package com.ki.level0.p181901;

public class Main {
    public static void main(String[] args) {

    }
}

// 정수 n과 k가 주어졌을 때,
// 1 이상 n 이하의 정수 중에서 k의 배수를
// 오름차순으로 저장한 배열을 return 하는 solution 함수를 완성해 주세요.

// n	k	result
// 10	3	[3, 6, 9]
// 15	5	[5, 10, 15]

class Solution {
    public int[] solution(int n, int k) {
        int size = 0;
        for (int i = 0; i <= n; i++) {
            if (i % k == 0 && i != 0) {
                size++;
            }
        }

        int[] answer = new int[size];
        int index = 0;
        for (int i = 0; i <= n; i++) {
            if (i % k == 0 && i != 0) {
                answer[index] = i;
                index++;
            }
        }
        return answer;
    }
}