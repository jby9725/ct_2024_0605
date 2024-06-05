package com.ki.level0.p181907;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    //  my_string	    n	    result
    // "ProgrammerS123"	11	    "ProgrammerS"

    @Test
    @DisplayName("\"ProgrammerS123\", 11 => \"ProgrammerS\"")
    void t1() {
        assertThat(new Solution().solution("ProgrammerS123", 11)).isEqualTo("ProgrammerS");
    }
    // "He110W0r1d"	    5	    "He110"

    @Test
    @DisplayName("\"He110W0r1d\", 5 => \"He110\"")
    void t2() {
        assertThat(new Solution().solution("He110W0r1d", 5)).isEqualTo("He110");
    }

}
