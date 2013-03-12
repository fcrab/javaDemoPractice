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
	//java ����ʾ�� collections
/*
	public static void main(String[] args){

		System.out.println("test Collections");
		
		//��ʼ������
		Collection<Integer> collection=new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
		//�Ƚ�����ĳ�ʼ����ʽ,addAll�����ٶȿ죬���ܿɱ������
		Integer[] moreInt={12,13,14};
		Collections.addAll(collection, 1,2,3,4,5,6,7,8);
		Collections.addAll(collection, moreInt);
		//���壡�ᱻ��ʼ��Ϊ���飬�޷�ʹ��add��delete����
		//ԭ��asList���������list������������裬����ע���䱻��ֵ������(����List)
		List<Integer> list=Arrays.asList(1,2,3,4,5,6);
		//runtime error:unsupported Operation
		//list.add(13);
		
		//��ʽ����˵������������asList���ͳ���Ľ����ʽ
		//���ӣ�
		List<Snow> snowList=new ArrayList<Snow>();
		// cannot convert from List<Powder> to List<Snow>
		//snowList=Arrays.asList(new Powder(),new Heavy());
		//����
		snowList=Arrays.<Snow>asList(new Powder(),new Heavy());
		
		//Iterator
		//LinkedList&&ArrayList
		
		//Stack
		
		//Set
		//�Զ�Ʋ���ظ�����
		Random rand=new Random(47);
		Set<Integer> intset=new HashSet<Integer>();
		for(int i=0;i<1000;i++){
			intset.add(rand.nextInt(30));
		}
		System.out.println(intset);
		
		//Queue����
		Queue<Integer> queue=new LinkedList<Integer>();
		for(int i=0;i<10;i++){
			queue.offer(rand.nextInt(i+100));
		}
		printQ(queue);
		Queue<Character> qc=new LinkedList<Character>();
		for(char c : "Brontosaurus".toCharArray())
			qc.offer(c);
		printQ(qc);
		//��ȷ���ֵ����
		System.out.println(qc.size());
		System.out.println(queue.size());
		
		//�����ȼ���Ķ��С�
		List<Integer> ints=Arrays.asList(25,22,10,15,13);
		//��ʼ�����趨��С������ʽ(����)
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
		while(queue.peek()!=null){		//peek��ɾ�������ص�һ��Ԫ�� 
			System.out.print(queue.remove()+" ");//���ز�ɾ����һ��Ԫ��
		}
		System.out.println();
	}
}

//������
class Snow{}
class Powder extends Snow{}
class Light extends Powder{}
class Heavy extends Powder{}
class Crusty extends Snow{}
class Slush extends Snow{}


