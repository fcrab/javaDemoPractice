package info.kikiFcrab.stringDemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringDemo {

	//ƥ��������ʽ
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p=Pattern.compile("\\w+");	//����
		Matcher m=p.matcher("Evening is full of the linnet's wings");	//ƥ��	
		while(m.find()){
			System.out.println(m.start()+" "+m.end());		//��ֹλ��
		}
	}

}
