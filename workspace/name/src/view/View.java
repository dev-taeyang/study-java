package view;

import java.io.IOException;

import dao.NamesDAO;
import domain.NamesVO;


public class View {

	public static void main(String[] args) throws IOException{
		
		NamesDAO namesDao = new NamesDAO();
		NamesVO namesVO = new NamesVO();
		namesDao.createFile(namesDao.merge());
		System.out.println(namesDao.merge());
	}
	
}
