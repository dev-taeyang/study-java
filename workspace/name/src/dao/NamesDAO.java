package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;


import domain.NamesVO;

public class NamesDAO {
	
	public ArrayList<NamesVO> merge() throws IOException{
		
		ArrayList<NamesVO> name = new ArrayList<NamesVO>();
		ArrayList<Integer> temp = null;
		ArrayList<NamesVO> result = new ArrayList<NamesVO>();
		
		HashSet<Integer> dataHashSet = new HashSet<Integer>();
		
		BoysDAO boysDAO = new BoysDAO();
		GirlsDAO girlsDAO = new GirlsDAO();
		
		String line = "";
		
		BufferedReader br = null;
		
		br = DBConnecter.getReader(DBConnecter.BOYSPATH);
		
		while((line = br.readLine()) != null) {
			
			name.add(boysDAO.setObject(line));
			
		}
		
		br = DBConnecter.getReader(DBConnecter.GIRLSPATH);
		
		while((line = br.readLine()) != null) {
			
			name.add(girlsDAO.setObject(line));
		}
		
		name.stream().map(v -> v.getAmount()).forEach(v -> dataHashSet.add(v));
		temp = new ArrayList<Integer>(dataHashSet);
		
		temp.sort(Collections.reverseOrder());
		
		int index = 1;
		
		for(int temps : temp) {
			
			for(NamesVO names : name) {
				
				if(names.getAmount() == temps) {
					
					names.setRank(index);
					result.add(names);
					
				}
				
			}
			index++;
		}
		
		return result;
	}
	
	public void createFile(ArrayList<NamesVO> arr) throws IOException{
		
		BufferedWriter bw = DBConnecter.getAppend(DBConnecter.NAMESSPATH);
		
		for(NamesVO name : arr) {
			
			bw.write(name.toString() + "\n");
		}
		
		if(bw != null) {
			
			bw.close();
		}
		
	}
	
	
}
