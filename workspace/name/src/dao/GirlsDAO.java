package dao;

import domain.GirlsVO;

public class GirlsDAO {
	
	private String[] datas = null;
	
	public GirlsVO setObject(String s) {
		
		GirlsVO girl = new GirlsVO();	//BoyVO�� �ʵ带 �ҷ���
		datas = s.split("\t");	// �Է¹��� ���ڿ��� tab�� �������� ���ø����ش��� datas��� �迭�� ��´�.
		
		girl.setName(datas[0]);	//boy�� name�� datas[o]�� ��������
		girl.setRank(Integer.valueOf(datas[1]));	//boy�� Rank�� datas[1]�� ��������
		girl.setAmount(Integer.valueOf(datas[2].replaceAll(",", "")));	//boy�� ���� datas[2]�� ��������
		
		return girl;
		
	}

}
