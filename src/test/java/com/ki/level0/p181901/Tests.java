package com.ki.level0.p181901;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

//n	k	result
//10	3	[3, 6, 9]
//15	5	[5, 10, 15]

public class Tests {
    @Test
    @DisplayName("10, 3 => [3, 6, 9]")
    void t1() {
        assertThat(new Solution().solution(10, 3)).isEqualTo(new int[]{3, 6, 9});
    }

    @Test
    @DisplayName("15, 5 => [5, 10, 15]")
    void t2() {
        assertThat(new Solution().solution(15, 5)).isEqualTo(new int[]{5, 10, 15});
    }

}
