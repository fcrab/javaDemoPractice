package info.kikiFcrab.Genericity;

import java.util.*;

public class GenericsRandomList<T> {

	private ArrayList<T> storage=new ArrayList<T>();
	private Random rand=new Random(47);	//47是种子数
	public void add(T item){
		storage.add(item);
	}
	public T select(){
		return storage.get(rand.nextInt(storage.size()));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsRandomList<String> rs=new GenericsRandomList<String>();
	}

}
