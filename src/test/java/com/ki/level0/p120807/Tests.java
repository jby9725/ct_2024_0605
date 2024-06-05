package com.ki.level0.p120807;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    @Test
    @DisplayName("17, 19 => -1")
    void t1() {
        assertThat(new Solution().solution(17, 19)).isEqualTo(-1);
    }

    @Test
    @DisplayName("11, 11 => 1")
    void t2() {
        assertThat(new Solution().solution(11, 11)).isEqualTo(1);
    }

    @Test
    @DisplayName("7, 99 => -1")
    void t3() {
        assertThat(new Solution().solution(7, 99)).isEqualTo(-1);
    }
}
