package cn.com.taiji.spring;

import java.util.Date;

public class ProxyUserService implements UserService {
    private UserService userService;

    public ProxyUserService(UserService userService){
        this.userService=userService;
    }
    @Override
    public void save() {
        System.out.println("before");
        Date start=new Date();
        userService.save();
        Date end=new Date();
        System.out.println("after");
        System.out.println("执行时间为："+(end.getTime()-start.getTime()));
    }

    @Override
    public void update() {
        System.out.println("before");
        Date start=new Date();
        userService.save();
        Date end=new Date();
        System.out.println("after");
        System.out.println("执行时间为："+(end.getTime()-start.getTime()));
    }
}
