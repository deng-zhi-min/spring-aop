package cn.com.taiji.spring;

/**
 * 单例模式饿汉式
 */
public class SingleTonUser {
    private SingleTonUser(){

    }

    private static SingleTonUser singleTonUser;

    public static SingleTonUser getInstance(){
        if(singleTonUser==null){
            singleTonUser=new SingleTonUser();
        }else{
            return singleTonUser;
        }
        return singleTonUser;
    }
}
