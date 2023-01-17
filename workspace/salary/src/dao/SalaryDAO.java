package dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Paths;

import domain.SalaryVO;

public class SalaryDAO {
//   �߰�
	public void insert(SalaryVO salaryVO) throws IOException {
		BufferedWriter bufferedWriter = DBConnecter.getAppend();
		String content = new String(Files.readAllBytes(Paths.get(DBConnecter.PATH)));
		String temp = null;
		temp = content.charAt(content.length() - 1) == '\n' ? "" : "\n";
		temp += salaryVO.toString();
		bufferedWriter.write(temp);
		bufferedWriter.close();
	}

//   ����(�ҵ漼)
	public void update(SalaryVO salaryVO) throws IOException {
		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";

		while ((line = bufferedReader.readLine()) != null) {
			if (line.split("   ")[0].equals(insertComma(salaryVO.getSalary()) + "����")) {
				String data = line.substring(0, line.lastIndexOf("   "));

				temp += data.substring(0, data.lastIndexOf("   ")) + "   " + insertComma(salaryVO.getIncomeTax())
						+ "   " + insertComma(salaryVO.getLocalTax()) + "\n";
				continue;
			}
			temp += line + "\n";
		}
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();
	}
//   ����(�������� �Է��Ͽ� �� �������� ���� continue �ؼ� ���� ����)

	public void remove(int salary) throws IOException {

		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";
		SalaryVO salaryVO = new SalaryVO();

		while ((line = bufferedReader.readLine()) != null) {
			if (line.split("   ")[0].equals(insertComma(salary) + "����")) {
				continue;
			}
			temp += line + "\n";
		}
		BufferedWriter bufferedWriter = DBConnecter.getWriter();
		bufferedWriter.write(temp);

		bufferedWriter.close();
		bufferedReader.close();

	}

//   ��ȸ(�������� �Է��Ͽ� �� �������� ���� �ܼ�â�� �������)

	public SalaryVO checkSalary(int salary) throws IOException {

		BufferedReader bufferedReader = DBConnecter.getReader();
		String line = null, temp = "";
		SalaryVO salaryVO = new SalaryVO();
		String[] result = null;
		int[] datas = null;

		while ((line = bufferedReader.readLine()) != null) {

			if (line.split("   ")[0].equals(insertComma(salary) + "����")) {

				temp = line;
				result = temp.split("   ");
				datas = new int[result.length];
				for (int i = 0; i < result.length; i++) {
					if (i == 0) {

						datas[i] = Integer.valueOf(result[i].replaceAll(",", "").replaceAll("����", ""));
						continue;
					}
					datas[i] = Integer.valueOf(result[i].replaceAll(",", ""));

				}
				salaryVO.setSalary(datas[0]);
				salaryVO.setNetPay(datas[1]);
				salaryVO.setTaxDeductionAmount(datas[2]);
				salaryVO.setPension(datas[3]);
				salaryVO.setHealthInsurance(datas[4]);
				salaryVO.setLongTermCarePay(datas[5]);
				salaryVO.setEmploymentInsurance(datas[6]);
				salaryVO.setIncomeTax(datas[7]);
				salaryVO.setLocalTax(datas[8]);

			}
		}
		bufferedReader.close();
		return salaryVO;
	}

//   ���

	public static String insertComma(int number) {
		String temp = String.valueOf(number);
		String result = "";

		for (int i = 0; i < temp.length(); i++) {
			if (i != 0 && i % 3 == 0) {
				result = "," + result;
			}
			result = temp.charAt(temp.length() - 1 - i) + result;
		}
		return result;
	}

}