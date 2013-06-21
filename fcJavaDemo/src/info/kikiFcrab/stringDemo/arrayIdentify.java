package info.kikiFcrab.stringDemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class arrayIdentify {
	
	private static ArrayConstant constant=new ArrayConstant();
	
	static{
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("arraylist identifing...");
		Map originMap=new HashMap();
		
		for(int counti=0;counti<constant.checkTable.length;counti++){
			originMap.put(constant.checkTable[counti], 1);
		}
		System.out.println(originMap.size());
		List uncompareNum=new ArrayList();
		for(int countj=0;countj<constant.numTable.length;countj++){
			if(originMap.get(constant.numTable[countj])==null){
				uncompareNum.add(constant.numTable[countj]);
			}
		}
		System.out.println(uncompareNum.size());
		
		for(Object aNum:uncompareNum){
			System.out.println(aNum.toString());
		}
	}
}
