package info.kikiFcrab.UnCompleteDecoupling;

import java.util.Arrays;

//完全耦合的状况,Apply和Processor耦合过紧,将导致Apply无法被其他类似Processor类所用
class Processor {
	public String name(){
		return getClass().getSimpleName();
	}
	Object process(Object input){
		return input;
	}
}

class Upcase extends Processor{
	String process(Object input){
		return ((String)input).toUpperCase();
	}
}

class Downcase extends Processor{
	String process(Object input){
		return ((String)input).toLowerCase();
	}
}

class Splitter extends Processor{
	String process(Object input){
		return Arrays.toString(((String)input).split(" "));
	}
}

public class Apply{
	public static void process(Processor p,Object s){
		System.out.println("using Processor"+p.name());
		System.out.println(p.process(s));
	}
	public static String s= "Disagreement with beliefs is by definition incorrect";
//	public static void main(String[] args){
//		process(new Upcase(),s);
//		process(new Downcase(),s);
//		process(new Splitter(),s);
//	}
}
