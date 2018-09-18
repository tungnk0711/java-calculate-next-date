package com.codegym;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetNextDateTest {

    @Test
    public void getNextDate20180228() {
        String today = "2018/02/28";
        String expected = "2018/03/01";

        String res = GetNextDate.getNextDate(today);

        assertEquals(expected,res);
    }
}