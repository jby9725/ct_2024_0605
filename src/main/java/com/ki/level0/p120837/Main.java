package com.ki.level0.p120837;

public class Main {
    public static void main(String[] args) {

    }
}

// 개미 군단이 사냥을 나가려고 합니다.
// 개미군단은 사냥감의 체력에 딱 맞는 병력을 데리고 나가려고 합니다.
// 장군개미는 5의 공격력을, 병정개미는 3의 공격력을 일개미는 1의 공격력을 가지고 있습니다.
// 예를 들어 체력 23의 여치를 사냥하려고 할 때, 일개미 23마리를 데리고 가도 되지만,
// 장군개미 네 마리와 병정개미 한 마리를 데리고 간다면 더 적은 병력으로 사냥할 수 있습니다.
// 사냥감의 체력 hp가 매개변수로 주어질 때, 사냥감의 체력에
// 딱 맞게 최소한의 병력을 구성하려면 몇 마리의 개미가 필요한지를 return 하도록 solution 함수를 완성해주세요.

class Solution {
    public int solution(int hp) {
        int answer = 0;
        int count = 0; // 한 종류의 개미들의 수
        int damage = 0; // 한 종류의 개미들의 공격력

        for (int i = 5; i >= 1; i -= 2) {
            if (hp >= i) { // i = 5, 3, 1
                // 5 이상이라면 5로 나눈 몫과 나머지를 가지고 3과 1 확인하자.
                count = hp / i;
                damage = count * i;
                hp = hp - damage; // 공격력만큼 깎이고 남은 hp
                // 계산된 개미들의 수(몫)는 answer 에 더하고, 나머지 hp를 가지고 3과 1 확인하기
                answer += count;
            }
        }
        return answer;
    }
}

// 반복문으로 처리하기 전 원본 코드
// class Solution {
//    public int solution(int hp) {
//        int answer = 0;
//        int count = 0; // 한 종류의 개미들의 수
//        int damage = 0; // 한 종류의 개미들의 공격력
//
//        // hp 초기값이 5 이상인지?
//        if (hp >= 5) {
//            // 5 이상이라면 5로 나눈 몫과 나머지를 가지고 3과 1 확인하자.
//            count = hp / 5;
//            damage = count * 5;
//            hp = hp - damage; // 공격력만큼 깎이고 남은 hp
//            // 계산된 개미들의 수(몫)는 answer에 더하고, 나머지 hp를 가지고 3과 1 확인하기
//            answer += count;
//        }
//        // hp 나머지(초기값)가 3 이상인지?
//        if (hp >= 3) {
//            // 몫은 answer에 더하고, 3 이상이라면 3으로 나눈 몫과 나머지를 가지고 1 확인하기
//            count = hp / 3;
//            damage = count * 3;
//            hp = hp - damage;
//            answer += count;
//        }
//        // hp 나머지(초기값)가 1 이상인지?
//        if (hp >= 1) {
//            // 몫은 answer에 더하고, 1 이상이라면 1로 나눈 몫을 answer에 더하기
//            count = hp / 1;
//            damage = count * 1;
//            hp = hp - damage;
//            answer += count;
//        }
//
//        return answer;
//    }
//}