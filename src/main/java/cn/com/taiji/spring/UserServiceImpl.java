package cn.com.taiji.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Date;

//默认单例模式
@Service
//@Scope("prototype")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    public void save(){
//        Date start=new Date();
//        userDao.save();
//        Date end=new Date();
//        System.out.println(end.getTime()-start.getTime());
//        System.out.println("service save..");
        System.out.println("UserServiceImpl save..");
    }

    @Override
    public void update(){
        System.out.println("service update...");
    }
}
