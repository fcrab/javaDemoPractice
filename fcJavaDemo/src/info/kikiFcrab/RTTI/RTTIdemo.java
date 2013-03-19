package info.kikiFcrab.RTTI;

import java.util.*;

import org.omg.CORBA.portable.IndirectionException;

//利用RTTI创建类型数组

public class RTTIdemo<T> {

	private Class<T> type;
	public RTTIdemo(Class<T> type){
		this.type=type;
	}
	public List<T> create(int nElements){
		List<T> result=new ArrayList<T>();
		try{
			for(int i=0;i<nElements;i++){
				result.add(type.newInstance());
			}
		}catch(Exception e){
			throw new RuntimeException(e);
		}
		return result;
	}
	
	/**
	 * @param args
	 */
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		RTTIdemo<CountedInteger> fl=
//				new RTTIdemo<CountedInteger>(CountedInteger.class);
//		System.out.println(fl.create(15));
//	}

}

//自定义的数组类
class CountedInteger{
	private static long count;
	private final long id=count++;
	public String toString(){
		return Long.toString(id);
	}
}
