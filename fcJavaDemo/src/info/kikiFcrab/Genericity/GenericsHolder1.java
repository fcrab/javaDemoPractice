package info.kikiFcrab.Genericity;

//泛型容器(T 类型参数)
public class GenericsHolder1<T> {
	private T a;
	public GenericsHolder1(T a){
		this.a=a;
	}
	public void set(T a){
		this.a=a;
	}
	public T get(){
		return a;
	}
	
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		GenericsHolder1<Integer> holder=new GenericsHolder1<Integer>(15);
//		int content=holder.get();
//		System.out.println(content);
//	}

}
