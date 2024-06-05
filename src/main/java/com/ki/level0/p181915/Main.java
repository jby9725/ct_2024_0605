package com.ki.level0.p181915;

public class Main {
    public static void main(String[] args) {

    }
}

// 문자열 my_string과 정수 배열 index_list가 매개변수로 주어집니다.
// my_string의 index_list의 원소들에 해당하는 인덱스의 글자들을
// 순서대로 이어 붙인 문자열을 return 하는 solution 함수를 작성해 주세요.

// my_string	        index_list	                                result
// "cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
// "zpiaz"	            [1, 2, 0, 0, 3]	                            "pizza"

class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";

        // answer += 'a'; // 가능
        // answer 문자열 길이는 index_list의 원소의 갯수와 똑같다
        // my_string의 x번째 원소를 result에 차곡차곡 쌓아서
        // 그 결과를 answer에 저장하여 추가한다.

        for (int i = 0; i < index_list.length; i++) {
            for (int j = 0; j < my_string.length(); j++) {
                if (index_list[i] == j) {
                    answer += my_string.charAt(j);
                }
            }
        }

        return answer;
    }
}