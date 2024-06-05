package com.ki.level0.p181908;

public class Main {
    public static void main(String[] args) {

    }
}

// 어떤 문자열에 대해서 접미사는 특정 인덱스부터 시작하는 문자열을 의미합니다.
// 예를 들어, "banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
// 문자열 my_string과 is_suffix가 주어질 때,
// is_suffix가 my_string의 접미사라면 1을, 아니면 0을 return 하는 solution 함수를 작성해 주세요.

// my_string	is_suffix	result
// "banana"	    "ana"	    1
// "banana"	    "nan"	    0
// "banana"	    "wxyz"	    0
// "banana"	    "abanana"	0

class Solution {
    public int solution(String my_string, String is_suffix) {
        if (is_suffix.length() > my_string.length())
            return 0;
        StringBuffer sb = new StringBuffer(my_string);
        String reverse_my_string = sb.reverse().toString();
        sb = new StringBuffer(is_suffix);
        String reverse_is_suffix = sb.reverse().toString();

        for (int i = 0; i < reverse_is_suffix.length(); i++) {
            if (reverse_is_suffix.charAt(i) == reverse_my_string.charAt(i)) {
                continue;
            }
            return 0;
        }

        return 1;
    }
}