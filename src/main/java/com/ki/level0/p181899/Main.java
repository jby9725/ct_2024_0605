package com.ki.level0.p181899;

public class Main {
    public static void main(String[] args) {

    }
}

// 정수 start_num와 end_num가 주어질 때,
// start_num에서 end_num까지 1씩 감소하는 수들을 차례로 담은 리스트를 return 하도록
// solution 함수를 완성해주세요.

class Solution {
    public int[] solution(int start, int end_num) {
        int[] answer = new int[start - end_num + 1];
        int index = 0;
        for (int i = start; i >= end_num; i--) {
            answer[index] = i;
            index++;
        }

        return answer;
    }
}