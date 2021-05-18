package java_20210518;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOutStreamDemo {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("C:\\dev\\test\\2021\\05\\18\\eclipse.zip");
			fos = new FileOutputStream("C:\\dev\\test\\2021\\05\\18\\eclipse-copy1.zip");
			
			/*int readByte = 0;
			long start = System.currentTimeMillis();
			//read()는 1바이트 읽어서 읽은 바이트를 반환한다.
			while((readByte = fis.read()) != -1) {
				//write()는 1바이트 쓰기를 한다.
				fos.write(readByte);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d초 %n", (end-start));
			*/
			int readByteCount = 0;
			byte[] readBytes = new byte[1024*10];
			long start = System.currentTimeMillis();
			//읽을 게 전부 끝나면 -1
			while((readByteCount = fis.read(readBytes)) != -1) {
				fos.write(readBytes,0,readByteCount);
			}
			long end = System.currentTimeMillis();
			System.out.printf("경과시간 : %d초 %n", (end - start));
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try{
				if(fis != null) fis.close();
				if(fos != null) fos.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
