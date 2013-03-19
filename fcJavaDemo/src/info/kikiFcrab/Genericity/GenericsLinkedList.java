package info.kikiFcrab.Genericity;

public class GenericsLinkedList<T> {

	private static class Node<U>{
		U item;
		Node<U> next;
		Node(){
			item=null;
			next=null;
		}
		Node(U item,Node<U> next){
			this.item=item;
			this.next=next;
		}
		boolean end(){
			return item==null&&next==null;
		}
	}
	
	//顶部节点(开始状态为结束节点)
	private Node<T> top=new Node<T>();
	
	//基本操作
	public void push(T item){
		top=new Node<T>(item,top);
	}
	public T pop(){
		T result=top.item;
		if(!top.end()){
			top=top.next;
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsLinkedList<String> lss=new GenericsLinkedList<String>();
		for(String s:"Phasers on stun!".split(" "))
			lss.push(s);
		String s;
		while((s=lss.pop())!=null){
			System.out.println(s);
		}
	}

}
