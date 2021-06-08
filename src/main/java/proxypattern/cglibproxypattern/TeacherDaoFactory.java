package proxypattern.cglibproxypattern;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author 麦田守望者
 * @Date 2020/8/18 16:37
 * @Version 1.0
 */
public class TeacherDaoFactory implements MethodInterceptor {
    private Object object;

    public TeacherDaoFactory(Object object) {
        this.object = object;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(object.getClass());
        enhancer.setCallback(this);
        Object o = enhancer.create();
        return o;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib老师教书前");
        Object invoke = method.invoke(object, objects);
        System.out.println("cglib老师教书后");
        return invoke;
    }
}
