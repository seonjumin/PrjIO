package ex01;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) throws IOException {
		String[] names = {"RM","진","슈가","제이홉","지민","뷔","정국"};
		
		String filename = "D:\\min\\java\\PrjIO\\src\\ex01.txt";
		//동일함 -> String filename = "D:/min/java/PrjIO/src/ex01";
		System.out.println(filename);
		String path = "c:\test\num01\read01\file";
		//특수기능 \t:tab, \n:엔터, \r:엔터, \f:프린터 form feed
		//특수문자가 아니라 경로로 표시하려면 "\"(X) -> "\\"
		System.out.println(path);
		//파일 생성 : open ~close 하면 새로운 파일 생성
		//java는 open명령을 new할때 실행한다.
		FileWriter fw = new FileWriter(filename);
		
		for(int i = 0 ; i < names.length; i++) {
			fw.write((i+1) + "." + names[i] + "\n");
		}
		
		fw.close();
		System.out.println("저장되었습니다.");

	}

}
