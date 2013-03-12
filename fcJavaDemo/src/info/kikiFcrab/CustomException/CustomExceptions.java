package info.kikiFcrab.CustomException;

public class CustomExceptions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			throw new Exception("Test Exception");
		}catch(Exception e){
			System.out.println("Caught Exception");
			//base Class£ºthrowable
			System.out.println("get Message():"+e.getMessage());
			System.out.println("getLocalizedMessage():"+e.getLocalizedMessage());
			System.out.println("toString():"+e.toString());
			System.out.print("printStackTrace():");
			e.printStackTrace(System.out);
		}
		
	}
	
	class SampleException extends Exception{
		
	}

}
