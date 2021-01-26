package cn.com.taiji.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//userService默认单例
public class SpringApplication {
    public static void main(String[] args) {
//        ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
//        for(String beanName:context.getBeanDefinitionNames()){
//            System.out.println(beanName);
//        }
//        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext("cn.com.taiji.spring");
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));

        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
//        context.addApplicationListener(new ApplicationStartedLinstner());
        context.refresh();
//        CollectionUtils.arrayToList(context.getBeanDefinitionNames()).forEach(item-> System.out.println(item));
        UserServiceImpl userService=context.getBean(UserServiceImpl.class);
        UserServiceImpl userService1=context.getBean(UserServiceImpl.class);
        userService.save();
        System.out.println(SingleTonUser.getInstance());
        System.out.println(SingleTonUser.getInstance());
        System.out.println(userService);
        System.out.println(userService1);
    }
}
