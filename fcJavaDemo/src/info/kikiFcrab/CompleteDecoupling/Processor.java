package info.kikiFcrab.CompleteDecoupling;

//完全解耦，将Processor定义为接口
public interface Processor {
	String name();
	Object process(Object input);
}
