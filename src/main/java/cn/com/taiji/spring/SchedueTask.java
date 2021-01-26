package cn.com.taiji.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component

public class SchedueTask implements InitializingBean {
//    执行bean之前的初始化操作
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("schedueTask init finshed");
    }
}
