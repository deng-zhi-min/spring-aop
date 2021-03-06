package cn.com.taiji.spring;

import org.junit.Test;

public class ProxyUserServiceTest {

    @Test
    public void testProxyUserService(){
        ProxyUserService proxyUserService=new ProxyUserService(new UserServiceImpl());
        proxyUserService.save();
    }

    @Test
    public void testProxyUserServicejdk(){
        ProxyJdk proxyUserServicejdk=new ProxyJdk(new UserServiceImpl());
        UserService userService=(UserService)ProxyJdk.getProxy();
        userService.update();
    }
}
