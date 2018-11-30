package org.lanqiao.domain;

import org.junit.Test;

public class UserTest {

    @Test
    public void GetInfoTest(){
        User user = new User();
        user.getInfo("wss","123456");
    }
}
