package view;

import java.io.IOException;

import dao.SalaryDAO;
import domain.SalaryVO;

public class Test {
   public static void main(String[] args) throws IOException{
      SalaryVO salaryVO = new SalaryVO();
      SalaryDAO salaryDAO = new SalaryDAO();

//    salaryDAO.insert(salaryVO);
      
//    salaryDAO.update(salaryVO);
//      ���� �޼ҵ� ���
//    salaryDAO.remove(3200);
//      ��ȸ �޼ҵ� ���
      salaryDAO.checkSalary(3400);
      System.out.println(salaryDAO.checkSalary(10000));
   }
}