package info.kikiFcrab.collection;

import java.util.LinkedList;

//linkedList版本的Stack
public class LinkedStack<T> {
	private LinkedList<T> storage=new LinkedList<T>();
	public void push(T v){storage.addFirst(v);}
	public T peek(){return storage.getFirst();}
	public T pop(){return storage.removeFirst();}
	public boolean isEmpty(){return storage.isEmpty();}
	//默认的输出
	public String toString(){
		return storage.toString();
	};
}

