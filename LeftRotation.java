package com.humanity.integrations.ultipro.mytest;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeftRotation {

    static int[] rotLeft(int[] a, int d) {

        int[] result = new int[a.length];

        for (int i = d; i < a.length + d; i++) {

            int index = i;

            if (index >= a.length) {
                index -= a.length;
            }

            result[i-d] = a[index];

        }

        return result;

    }

    @Test
    public void testLeftRotate() {

        int[] a = {1, 2, 3, 4, 5};

        int[] result = rotLeft(a, 4);
        assertThat(result).isEqualTo(new int[]{5, 1, 2, 3, 4});

        result = rotLeft(a, 1);
        assertThat(result).isEqualTo(new int[]{2, 3, 4, 5, 1});

    }

}
