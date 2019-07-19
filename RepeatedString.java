package com.humanity.integrations.ultipro.mytest;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class RepeatedString {

    static long repeatedString(String s, long n) {

        if (s.length() == 1) {
            if (s.charAt(0) == 'a') {
                return n;
            } else {
                return 0;
            }
        }

        int count = 0;
        int pointer = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(pointer) == 'a') {
                ++count;
            }

            ++pointer;
            if (pointer == s.length()) {
                pointer = 0;
            }
        }

        return count;

    }

    @Test
    public void testRepeatedString() {

        long result = repeatedString("aba", 10);

        Assertions.assertThat(result).isEqualTo(7);

    }

    @Test
    public void testRepeatedString2() {

        long result = repeatedString("a", 1000000000000L);

        Assertions.assertThat(result).isEqualTo(1000000000000L);

    }

    @Test
    public void testRepeatedString3() {

        long result = repeatedString("b", 1000000000000L);

        Assertions.assertThat(result).isEqualTo(0);

    }

    @Test
    public void testRepeatedString4() {

        long result = repeatedString("aaa", 10);

        Assertions.assertThat(result).isEqualTo(10);

    }

    @Test
    public void testRepeatedString5() {

        long result = repeatedString("aba", 1000000000000L);

        Assertions.assertThat(result).isEqualTo(1000000000000L);

    }

}
