package bank;

import java.util.Scanner;

public class Bank {
	
	 // �� ����
	Bank[][] customer; // �մԵ� ���� ���� 2���迭
	int accountNumber; // ���¹�ȣ
	int phoneNumber; // ����ȣ
	int[] passWord; // ��й�ȣ
	int bankBalance; // �����ܰ�
	boolean logInCheck; // �α��� Ȯ��
	boolean accountNumberCheck;
	boolean passWordCheck;
	
	public Bank() {;} // �⺻ ������

	public Bank(int accountNumber, int[] passWord) { // ������ Ȯ�� ������
		super();
		this.accountNumber = accountNumber;
		this.passWord = passWord;
	}
	
	
//		�� ���� �Է� �޼ҵ�
	void Customer (Bank sinhanBank, Bank[] name) { 
		this.customer = new Bank[3][100]; // �迭�� ���̸� �˶� �ʱ�ȭ.
	
			name = new Bank[100];
			SinhanBank sinhan = new SinhanBank();
			KakaoBank kakao = new KakaoBank();
			KbBank kb = new KbBank();
			customer[0] = sinhan.sinhanCustomer; // 1���࿡ sinhan �迭�� ����
			customer[1] = kakao.kakaoCoustmer;  // 2���࿡ kakao �迭 ����
			customer[2] = kb.kbCustomer;		// 3���࿡ kb �迭 ����
			
			for (int j = 0; j < customer[j].length; j++) {
				
				customer[3][j] = name[j] ; // ���鿡 �Է°��� �־���.
				
			}

	
		}
		
		
	void logIn (int accountNumber, int[] passWord) { // �α���
		this.accountNumber = 0; // �ʱ�ȭ
		this.passWord = new int[4];		// �ʱ�ȭ
		passWord = new int[4]; // �ʱ�ȭ
		this.accountNumberCheck = false; // �ʱ�ȭ
		this.logInCheck = false; // �ʱ�ȭ
		boolean flag = true;

		while(true) {
			
			if(this.accountNumber == accountNumber) {
			
				for (int i = 0; i < passWord.length; i++) {
				
					if(this.passWord[i] == passWord[i])
					{ 
						this.logInCheck = true;
						System.out.println("�α���!");
					}
					else 
					{ 					
						this.logInCheck = false;
						System.out.println("��й�ȣ�� �ٸ��ϴ�.\n ������.");
						flag = false;
					}
		
				}

			}	else 
				{	
					this.accountNumberCheck = false;
					System.out.println("���¹�ȣ�� �ٸ��ϴ�.\n �����մϴ�.");
					flag = false;
				}
			if(flag == false) {
				
				break;
			}
			
			if(logInCheck == true && passWordCheck == true) {
				break;
			}
		}
	}
	
	
	

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			int[] num = new int[4];
			
			for (int i = 0; i < num.length; i++) {
				
				num[i] = sc.nextInt();
				
			}
			SinhanBank sinhan = new SinhanBank();
			Bank bank = new Bank();
			sinhan.logIn(1234, num);
			bank.logIn(1234, num);
//			bank.customer[0][0]  = {1}
			System.out.println(bank.customer[0][0]);
			
		}

		
		}
	
	
	


