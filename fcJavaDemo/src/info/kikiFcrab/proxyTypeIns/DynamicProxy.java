package info.kikiFcrab.proxyTypeIns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//动态代理类只能代理接口，代理类都需要实现InvocationHandler类,实现invoke方法。
//该方法就是调用被代理接口的所有方法时需要调用的，返回的值是被代理接口的一个实现类
public class DynamicProxy implements InvocationHandler {

	private Object obj;
	
	public Object bindRelation(Object obj){
		this.obj=obj;
		return Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("running in the dynamic class");
		Object result=method.invoke(obj, args);
		return result;
	}

	
}
