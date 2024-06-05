package com.ki.level0.p181896;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {
    @Test
    @DisplayName("[12, 4, 15, 46, 38, -2, 15] => 5")
    void t1() {
        assertThat(new Solution().solution(new int[]{12, 4, 15, 46, 38, -2, 15})).isEqualTo(5);

    }

    @Test
    @DisplayName("[13, 22, 53, 24, 15, 6] => -1")
    void t2() {
        assertThat(new Solution().solution(new int[]{22, 13, 53, 24, 15, 6})).isEqualTo(-1);
    }
}