package arrayListTask;

import java.util.ArrayList;
import java.util.Iterator;

import collectionTask.DBConnecter;
import collectionTask.User;

public class Market {
	
	public ArrayList<Fruit> fruits = arrayListTask.DBConnecter.fruits;
	
	
	
//			과일추가
	public void fruitAdd(Fruit fruit) {
		
		fruits.add(fruit);
		
	}
//			과일 삭제
	public Fruit fruitRemove(Fruit fruit) {
		
		
		for(Fruit fruits : fruits) {
			
			if(fruits.getFruit().equals(fruit)) {
				
				fruits.setFruit(null);
				return fruit;
			}
			
			
		}
		return null;
		
	}
//			과일평균 구하기
	private	int fruitAVR(Fruit fruit) {
		
		int sum = 0;
		
		for(Fruit fruits : fruits) {
			
			sum = sum + fruits.getPrice();
			
		}
		
		return sum / fruits.size();
		
		
		
		
	}
	
//			과일가격이 평균가격보다 낮은지 검사.
	public void avrCheck(Fruit fruit) {
		
		for(Fruit fruits : fruits) {
			
			if(fruitAVR(fruit) > fruits.getPrice()) {
				
				System.out.println("시장 평균가격보다 비쌉니다.");
				
			}else {
				
				System.out.println("시장 가격보다 저렴합니다.");
				
			}

		}
		
	}
	
//			과일 전체 조회
	
	public void checkFruit() {
		
		
			
			System.out.println(fruits);
			
		
		
	}
	
//			과일 이름으로 가격조회
	
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
// 강사님 버전

//package arrayListTask;
//
//import java.util.ArrayList;
//
//public class Market {
//   public ArrayList<Fruit> fruits = DBConnecter.fruits;
//   
//// 과일 검사
//   public Fruit checkFruit(String name) {
//      for (Fruit fruit : fruits) {
//         if(fruit.getName().equals(name)) {
//            return fruit;
//         }
//      }
//      return null;
//   }
//   
////   과일 추가
//   public void add(Fruit fruit) {
//      fruits.add(fruit);
//   }
//   
////   과일 삭제
//   public void remove(String name) {
//      Fruit fruit = checkFruit(name);
//      fruits.remove(fruit);
//   }
//   
////   과일 가격이 평균 가격보다 낮은 지 검사
//   public boolean checkPrice(int price) {
//      return getAverage() > price;
//   }
//   
////   평균 가격
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
////   과일 전체 조회
//   public ArrayList<Fruit> selectAll() {
//      return fruits;
//   }
//   
////   과일 이름으로 가격 조회
//   public int findByName(String name) {
//      return checkFruit(name).getPrice();
//   }
//}

















