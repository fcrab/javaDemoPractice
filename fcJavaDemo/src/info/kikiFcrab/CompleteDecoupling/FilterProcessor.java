package info.kikiFcrab.CompleteDecoupling;

//��ȫ���ͨ���������ķ�ʽ��Apply.process�����ܹ���������������
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
	//���Ե�Ԫ
//	public static void main(String[] args){
//		Waveform w=new Waveform();
//		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
//		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
//	}
}


