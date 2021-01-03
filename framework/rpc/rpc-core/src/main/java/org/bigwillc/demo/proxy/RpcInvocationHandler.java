package org.bigwillc.demo.proxy;

import com.alibaba.fastjson.parser.ParserConfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author bigwillc
 **/
@Slf4j
public class RpcInvocationHandler implements InvocationHandler, MethodInterceptor {


    private final Class<?> serviceClass;
    private final String url;

    <T> RpcInvocationHandler(Class<T> serviceClass, String url) {
        this.serviceClass = serviceClass;
        this.url = url;
        // 这句时干什么用的
        ParserConfig.getGlobalInstance().setAutoTypeSupport(true);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return null;
    }

    public Object process(Class<?> serviceClass, Method method, Object[] params, String url) {

        return null;
    }
}
