package info.kikiFcrab.proxyTypeIns;

public class StaticProxy implements baseTestInterface {

	public baseTestInterface testImpl;
	public StaticProxy(baseTestInterface testImpl){
		this.testImpl=testImpl;
	}
	
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("running in the Static Proxy");
		//»Øµ÷...
		testImpl.print();
	}

}
