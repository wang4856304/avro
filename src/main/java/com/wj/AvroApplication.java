package com.wj;

import com.wj.entity.User;

public class AvroApplication {

    public static void main(String args[]) {
        User user = new User();
        user.setName("wangjun");
        user.setFavoriteColor("red");
        user.setFavoriteNumber(11);
    }
}
