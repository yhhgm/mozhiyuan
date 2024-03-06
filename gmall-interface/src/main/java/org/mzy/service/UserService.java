package org.mzy.service;

import org.mzy.bean.UserAddress;


import java.util.List;


/**
 *
 * 1.将服务的提供者 注册到注册中心
 *      a.导入Dubbo依赖 引入操作zookeeper的客户端
 *      b.配置服务提供者 （暴露服务）
 * 2.让服务消费这去服务中心订阅服务提供者的服务地址
 * */
public interface UserService {

    /*
    * 按照用户id返回用户的收货地址
    * */
    public List<UserAddress> getUserAddressList(String userId);
}
