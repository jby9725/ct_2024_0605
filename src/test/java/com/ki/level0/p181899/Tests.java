package com.ki.level0.p181899;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    @Test
    @DisplayName("10, 3 => [10, 9, 8, 7, 6, 5, 4, 3]")
    void t1() {
        assertThat(new Solution().solution(10,3)).isEqualTo(new int[]{10, 9, 8, 7, 6, 5, 4, 3});
    }
}
