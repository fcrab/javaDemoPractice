package info.kikiFcrab.CompleteDecoupling;

//完全解耦，通过适配器的方式让Apply.process做到能够被其他类所复用
class FilterAdapter implements Processor {
	Filter filter;
	public  FilterAdapter(Filter filter){
		this.filter=filter;
	}
	@Override
	public String name() {
		// TODO Auto-generated method stub
		return filter.name();
	}
	@Override
	public Waveform process(Object input) {
		// TODO Auto-generated method stub
		return filter.process((Waveform)input);
	}
	
}

public class FilterProcessor{
	//测试单元
//	public static void main(String[] args){
//		Waveform w=new Waveform();
//		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
//		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
//	}
}


