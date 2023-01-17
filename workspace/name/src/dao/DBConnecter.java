package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class DBConnecter {
	
	public static final String BOYSPATH = "boys.txt";	// boys�޸��� ����� ����
	public static final String GIRLSPATH = "girls.txt";	// girls�޸���
	public static final String NAMESSPATH = "names.txt";	//names�޸���
	
	public static BufferedWriter getWriter(String path) throws IOException{	// ������ ������� �Է����ִ� ����
		
		return new BufferedWriter(new FileWriter(path));
		
	}
	public static BufferedWriter getAppend(String path) throws IOException{	// ������ ������ �ִ°ſ� �߰��� �Է�
		
		return new BufferedWriter(new FileWriter(path, true));
		
	}
	public static BufferedReader getReader(String path) throws IOException{	// ������ �о�ͼ� ������ִ� ����
		
		return new BufferedReader(new FileReader(path));
		
	}

}
