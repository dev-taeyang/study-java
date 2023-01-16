package arrayListTask;

import java.util.ArrayList;
import java.util.Iterator;

import collectionTask.DBConnecter;
import collectionTask.User;

public class Market {
	
	public ArrayList<Fruit> fruits = arrayListTask.DBConnecter.fruits;
	
	
	
//			�����߰�
	public void fruitAdd(Fruit fruit) {
		
		fruits.add(fruit);
		
	}
//			���� ����
	public Fruit fruitRemove(Fruit fruit) {
		
		
		for(Fruit fruits : fruits) {
			
			if(fruits.getFruit().equals(fruit)) {
				
				fruits.setFruit(null);
				return fruit;
			}
			
			
		}
		return null;
		
	}
//			������� ���ϱ�
	private	int fruitAVR(Fruit fruit) {
		
		int sum = 0;
		
		for(Fruit fruits : fruits) {
			
			sum = sum + fruits.getPrice();
			
		}
		
		return sum / fruits.size();
		
		
		
		
	}
	
//			���ϰ����� ��հ��ݺ��� ������ �˻�.
	public void avrCheck(Fruit fruit) {
		
		for(Fruit fruits : fruits) {
			
			if(fruitAVR(fruit) > fruits.getPrice()) {
				
				System.out.println("���� ��հ��ݺ��� ��Դϴ�.");
				
			}else {
				
				System.out.println("���� ���ݺ��� �����մϴ�.");
				
			}

		}
		
	}
	
//			���� ��ü ��ȸ
	
	public void checkFruit() {
		
		
			
			System.out.println(fruits);
			
		
		
	}
	
//			���� �̸����� ������ȸ
	
	public void nameToPrice(Fruit fruit) {
		
		for(Fruit fruits : fruits) {
			
			if(fruits.getFruit().equals(fruits)) {
				
				System.out.println(fruits.getPrice());
				break;
				
			}
			
		}
		
	}
	

}


////////////////////////////////////////////////////////////////////////////////////
// ����� ����

//package arrayListTask;
//
//import java.util.ArrayList;
//
//public class Market {
//   public ArrayList<Fruit> fruits = DBConnecter.fruits;
//   
//// ���� �˻�
//   public Fruit checkFruit(String name) {
//      for (Fruit fruit : fruits) {
//         if(fruit.getName().equals(name)) {
//            return fruit;
//         }
//      }
//      return null;
//   }
//   
////   ���� �߰�
//   public void add(Fruit fruit) {
//      fruits.add(fruit);
//   }
//   
////   ���� ����
//   public void remove(String name) {
//      Fruit fruit = checkFruit(name);
//      fruits.remove(fruit);
//   }
//   
////   ���� ������ ��� ���ݺ��� ���� �� �˻�
//   public boolean checkPrice(int price) {
//      return getAverage() > price;
//   }
//   
////   ��� ����
//   private double getAverage() {
//      int total = 0;
//      
//      for (Fruit fruit : fruits) {
//         total += fruit.getPrice();
//      }
//      
//      return (double)total / fruits.size();
//   }
//   
////   ���� ��ü ��ȸ
//   public ArrayList<Fruit> selectAll() {
//      return fruits;
//   }
//   
////   ���� �̸����� ���� ��ȸ
//   public int findByName(String name) {
//      return checkFruit(name).getPrice();
//   }
//}

















