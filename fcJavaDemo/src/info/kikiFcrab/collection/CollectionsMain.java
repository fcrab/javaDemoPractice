package info.kikiFcrab.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Set;

public class CollectionsMain {
	//java 容器示例 collections
/*
	public static void main(String[] args){

		System.out.println("test Collections");
		
		//初始化方法
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		//比较灵活方便的初始化方式,addAll运行速度快，接受可变参数表
		Integer[] moreInt={12,13,14};
		Collections.addAll(collection, 1,2,3,4,5,6,7,8);
		Collections.addAll(collection, moreInt);
		//陷阱！会被初始化为数组，无法使用add或delete方法
		//原因：asList对其产生的list进行最理想假设，并不注意其被赋值的类型(例如List)
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		//runtime error:unsupported Operation
		//list.add(13);
		
		//显式类型说明，对于上面asList类型出错的解决方式
		//栗子：
		List<Snow> snowList=new ArrayList<Snow>();
		// cannot convert from List<Powder> to List<Snow>
		//snowList=Arrays.asList(new Powder(),new Heavy());
		//正解
		snowList=Arrays.<Snow>asList(new Powder(),new Heavy());
		
		//Iterator
		//LinkedList&&ArrayList
		
		//Stack
		
		//Set
		//自动撇除重复数据
		Random rand=new Random(47);
		Set<Integer> intset=new HashSet<Integer>();
		for(int i=0;i<1000;i++){
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
		
		//Queue队列
		Queue<Integer> queue=new LinkedList<Integer>();
		for(int i=0;i<10;i++){
			queue.offer(rand.nextInt(i+100));
		}
		printQ(queue);
		Queue<Character> qc=new LinkedList<Character>();
		for(char c : "Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
		//正确理解值传递
		System.out.println(qc.size());
		System.out.println(queue.size());
		
		//带优先级别的队列。
		List<Integer> ints=Arrays.asList(25,22,10,15,13);
		//初始化，设定大小和排序方式(倒序)
		PriorityQueue<Integer> priorityQueue =new PriorityQueue<Integer>(ints.size(),Collections.reverseOrder());
		priorityQueue.addAll(ints);
		printQ(priorityQueue);
		try{}
		catch(Exception e){
			e.printStackTrace();
		}
	}
*/
	private static void printQ(Queue queue){
		while(queue.peek()!=null){		//peek不删除，返回第一个元素 
			System.out.print(queue.remove()+" ");//返回并删除第一个元素
		}
		System.out.println();
	}
}

//栗子们
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}


