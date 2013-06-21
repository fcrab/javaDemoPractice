package info.kikiFcrab.network;

import java.io.*;
import java.net.*;

//服务器demo
public class ServerDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			//创建Socket(端口8090)
			ServerSocket serverSocket=new ServerSocket(8090);
			while(true){
				//接收客户信息
				Socket client=serverSocket.accept();
				System.out.println("client accept");
				try{
					//获取连接的信息
					BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
					String str=in.readLine();
					System.out.println(str);
					
					//关闭数据流
					in.close();
				}catch(Exception e){
					
				}finally{
					//关闭连接
					client.close();
				}
				
			}
		}catch(Exception ex){
			
		}
	}

	public static void main(String argv[]){
		Thread serverThread =new Thread(new ServerDemo());
		serverThread.start();
	}
}

