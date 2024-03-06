package org.mzy.service.Impl;

import org.mzy.bean.UserAddress;

import java.util.Arrays;
import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<UserAddress> getUserAddressList(String userId) {

        UserAddress address1 = new UserAddress(1,"北京市昌平区","1","李老师","13131231","1");
        UserAddress address2 = new UserAddress(2,"北京市昌平区sdedfsd","1","李老师","13131231","1");


        return Arrays.asList(address1,address2);
    }
}
