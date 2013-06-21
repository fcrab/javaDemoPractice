package info.kikiFcrab.network;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;

public class NetworkDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello network");
		
		//默认的get方法
		String urlString="http://elog.gdbnet.cn:8001/LecManager/whSalesMobile/login";
		try{
			URL url=new URL(urlString);
			HttpURLConnection httpConn=(HttpURLConnection) url.openConnection();
			InputStreamReader in=new InputStreamReader(httpConn.getInputStream(),"UTF-8");
			BufferedReader buffer=new BufferedReader(in);
			String inputLine=null;
			String resultData="";
			while((inputLine=buffer.readLine())!=null){
				resultData+=inputLine+"\n";
			}
			System.out.println(resultData);
		}catch(Exception e1){
			e1.printStackTrace();
		}

		//设置为post方法
		try{
			URL url=new URL(urlString);
			HttpURLConnection httpConn=(HttpURLConnection) url.openConnection();
			
			//设置为可输入输出
			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);
			//POST方法
			httpConn.setRequestMethod("POST");
			//不能使用缓存
			httpConn.setUseCaches(false);
			
			httpConn.setInstanceFollowRedirects(false);
			
			//配置Content-type
			httpConn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			
			//隐含了httpConn.connect
			DataOutputStream out=new DataOutputStream(httpConn.getOutputStream());
			//上传的参数
			String content="imsi="+URLEncoder.encode("12429428329","utf-8");
			out.writeBytes(content);
			out.flush();
			out.close();
			
			InputStream in=httpConn.getInputStream();
			BufferedReader buffer=new BufferedReader(new InputStreamReader(in, "UTF-8"));
			String inputLine=null;
			String resultData="";
			while((inputLine=buffer.readLine())!=null){
				resultData+=inputLine+"\n";
			}
			System.out.println(resultData);
		}catch(Exception e1){
			e1.printStackTrace();
		}
		
		
	}

}
