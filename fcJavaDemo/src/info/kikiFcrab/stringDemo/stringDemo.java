package info.kikiFcrab.stringDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringDemo {

	//匹配正则表达式
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("\\w+");	//编译
		Matcher m=p.matcher("Evening is full of the linnet's wings");	//匹配	
		while(m.find()){
			System.out.println(m.start()+" "+m.end());		//起止位置
		}
	}

}
