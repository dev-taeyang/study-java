package dao;

import domain.BoysVO;

public class BoysDAO {
	
	private String[] datas = null;
	
	public BoysVO setObject(String s) {
		
		BoysVO boy = new BoysVO();	//BoyVO�� �ʵ带 �ҷ���
		datas = s.split("\t");	// �Է¹��� ���ڿ��� tab�� �������� ���ø����ش��� datas��� �迭�� ��´�.
		
		boy.setName(datas[0]);	//boy�� name�� datas[o]�� ��������
		boy.setRank(Integer.valueOf(datas[1]));	//boy�� Rank�� datas[1]�� ��������
		boy.setAmount(Integer.valueOf(datas[2].replaceAll(",", "")));	//boy�� ���� datas[2]�� ��������
		
		return boy;
		
	}
	

}
