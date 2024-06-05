package com.ki.level0.p181920;

public class Main {
    public static void main(String[] args) {

    }
}

// 정수 start_num와 end_num가 주어질 때,
// start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return 하도록 solution 함수를 완성해주세요.

// start_num	end_num	    result
// 3	        10	        [3, 4, 5, 6, 7, 8, 9, 10]

class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        int num = start_num;

        for (int i = 0; i < answer.length; i++) {
            answer[i] = num;
            num++;
        }

        return answer;
    }
}