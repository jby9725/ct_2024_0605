package com.ki.level0.p181915;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Tests {

    // my_string	        index_list	                                result
    // "cvsgiorszzzmrpaqpe"	[16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7]	"programmers"
    @Test
    @DisplayName("\"cvsgiorszzzmrpaqpe\", [16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7] => \"programmers\"")
    void t1() {
        assertThat(new Solution().solution("cvsgiorszzzmrpaqpe", new int[]{16, 6, 5, 3, 12, 14, 11, 11, 17, 12, 7})).isEqualTo("programmers");
    }

    // my_string	        index_list	                                result
    // "zpiaz"	            [1, 2, 0, 0, 3]	                            "pizza"
    @Test
    @DisplayName("\"zpiaz\" , [1, 2, 0, 0, 3] => \"pizza\"")
    void t2() {
        assertThat(new Solution().solution("zpiaz", new int[]{1, 2, 0, 0, 3})).isEqualTo("pizza");
    }
}
