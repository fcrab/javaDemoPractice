package info.kikiFcrab.network;

import java.io.*;
import java.net.*;

//������demo
public class ServerDemo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			//����Socket(�˿�8090)
			ServerSocket serverSocket=new ServerSocket(8090);
			while(true){
				//���տͻ���Ϣ
				Socket client=serverSocket.accept();
				System.out.println("client accept");
				try{
					//��ȡ���ӵ���Ϣ
					BufferedReader in=new BufferedReader(new InputStreamReader(client.getInputStream()));
					String str=in.readLine();
					System.out.println(str);
					
					//�ر�������
					in.close();
				}catch(Exception e){
					
				}finally{
					//�ر�����
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

