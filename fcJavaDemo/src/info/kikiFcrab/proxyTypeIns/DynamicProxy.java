package info.kikiFcrab.proxyTypeIns;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//��̬������ֻ�ܴ���ӿڣ������඼��Ҫʵ��InvocationHandler��,ʵ��invoke������
//�÷������ǵ��ñ�����ӿڵ����з���ʱ��Ҫ���õģ����ص�ֵ�Ǳ�����ӿڵ�һ��ʵ����
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
