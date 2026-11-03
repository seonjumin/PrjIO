package ex01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	//java는 예외처리 필수 - 반드시 
	public static void main(String[] args) throws IOException {
		
		String path = "D:\\min\\java\\PrjIO\\src\\ex01\\";
		String filename = "ex01.txt";
		
		FileReader fr = new FileReader(path + filename);
		BufferedReader br = new BufferedReader(fr);
		//반복 횟수를 모르는 반복 : while() EOF : End Of File
		String line = "";
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		
		fr.close();
		
		System.out.println("End...");

	}

}
