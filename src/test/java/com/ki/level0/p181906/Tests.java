package com.ki.level0.p181906;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

// my_string	is_prefix	result
// "banana"	    "ban"	    1
// "banana"	    "nan"	    0
// "banana"	    "abcd"	    0
// "banana"	    "bananan"	0

public class Tests {
    @Test
    @DisplayName("\"banana\",\"ban\" => 1")
    void t1() {
        assertThat(new Solution().solution("banana", "ban")).isEqualTo(1);
    }

    @Test
    @DisplayName("\"banana\", \"nan\" => 0")
    void t2() {
        assertThat(new Solution().solution("banana", "nan")).isEqualTo(0);
    }

    @Test
    @DisplayName("\"banana\" , \"abcd\" => 0")
    void t3() {
        assertThat(new Solution().solution("banana", "abcd")).isEqualTo(0);
    }

    @Test
    @DisplayName("\"banana\" , \"bananan\" => 0")
    void t4() {
        assertThat(new Solution().solution("banana", "bananan")).isEqualTo(0);
    }
}
