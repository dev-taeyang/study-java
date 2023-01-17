package dao;

import domain.GirlsVO;

public class GirlsDAO {
	
	private String[] datas = null;
	
	public GirlsVO setObject(String s) {
		
		GirlsVO girl = new GirlsVO();	//BoyVO의 필드를 불러옴
		datas = s.split("\t");	// 입력받을 문자열을 tab을 기준으로 스플릿해준다음 datas라는 배열에 담는다.
		
		girl.setName(datas[0]);	//boy의 name을 datas[o]로 세팅해줌
		girl.setRank(Integer.valueOf(datas[1]));	//boy의 Rank를 datas[1]로 세팅해줌
		girl.setAmount(Integer.valueOf(datas[2].replaceAll(",", "")));	//boy의 수를 datas[2]로 세팅해줌
		
		return girl;
		
	}

}
