package proxypattern.dynamicproxypattern;


import java.lang.reflect.Proxy;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 16:37
 * @Version 1.0
 */
public class TeacherDaoFactory {
    private Object object;

    public TeacherDaoFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("老师上课前。。。。");
                    Object returnVal = method.invoke(object, args);
                    System.out.println("老师上课后。。。。");
                    return returnVal;
                });
    }

    /*public Object getProxyInstance() {
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),
                object.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("老师上课前");
                        Object result = method.invoke(object, args);
                        System.out.println("老师上课后");
                        return result;
                    }
                }
    }*/
}
