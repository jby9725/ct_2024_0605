package com.ki.level0.p120837;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class Tests {

    // hp	result
    // 23	5
    @Test
    @DisplayName("23 => 5")
    void t1() {
        assertThat(new Solution().solution(23)).isEqualTo(5);
    }

    // 24	6
    @Test
    @DisplayName("24 => 6")
    void t2() {
        assertThat(new Solution().solution(24)).isEqualTo(6);
    }

    // 999	201
    @Test
    @DisplayName("999 => 201")
    void t3() {
        assertThat(new Solution().solution(999)).isEqualTo(201);
    }

    // 57 => 13
    @Test
    @DisplayName("57 => 13")
    void t4() {
        assertThat(new Solution().solution(57)).isEqualTo(13);
    }

}
