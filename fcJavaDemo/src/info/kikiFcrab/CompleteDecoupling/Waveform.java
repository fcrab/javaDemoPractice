package info.kikiFcrab.CompleteDecoupling;

public class Waveform {
	private static long count;
	private final long id =count++;
	public String toString(){
		return "Waveform"+id;
	}
}
