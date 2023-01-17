package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnecter {
	
	public static final String BOYSPATH = "boys.txt";	// boys메모장 상수로 선언
	public static final String GIRLSPATH = "girls.txt";	// girls메모장
	public static final String NAMESSPATH = "names.txt";	//names메모장
	
	public static BufferedWriter getWriter(String path) throws IOException{	// 파일을 덮어씌워서 입력해주는 역할
		
		return new BufferedWriter(new FileWriter(path));
		
	}
	public static BufferedWriter getAppend(String path) throws IOException{	// 파일을 기존에 있는거에 추가로 입력
		
		return new BufferedWriter(new FileWriter(path, true));
		
	}
	public static BufferedReader getReader(String path) throws IOException{	// 파일을 읽어와서 출력해주는 역할
		
		return new BufferedReader(new FileReader(path));
		
	}

}
