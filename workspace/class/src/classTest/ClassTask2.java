//package classTest;
//
//
//public class ClassTask2 {
////   �ִ밪, �ּҰ� ���ϱ�
//   void getMaxAndMin(int[] arData, Result result) {
//      result.max = arData[0];
//      result.min = arData[0];
//      
//      for (int i = 0; i < arData.length; i++) {
//         if(result.max < arData[i]) {result.max = arData[i];}
//         if(result.min > arData[i]) {result.min = arData[i];}
//      }
//   }
//   
//   �л���ȣ, ��������, ��������, ���������� �Է¹��� �� �� �հ� ��� ���ϱ�
//   void getTotalAndAverage(Student student) {
//      student.total += student.kor + student.eng + student.math;
//      student.average = student.total / 3.0;
//   }
//   
//   public static void main(String[] args) {
//      ClassTask2 classTask2 = new ClassTask2();
//      Student student = new Student(1, 50, 80, 90);
//      
//      System.out.println(student.total);
//      System.out.println(student.average);
//      Result result = new Result();
//      int[] arData = {1, 5, 3, 7, 8};
//      classTask2.getMaxAndMin(arData, result);
//System.out.println(result.max);
//    System.out.println(result.min);
// }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
////public class ClassTask2 {
////	
////	
////	void getSumAndaAVR(int[] arData, Result result, int sum) {
////		
////		result.sum = arData[0];
////		result.avr = arData[1];
////		
////		for (int i = 0; i < arData.length; i++) {
////			
////			sum += arData[i];
////			
////		}
////		result.sum = sum;
////		result.avr = sum / arData.length;
////		
////	}
////	
////	public static void main(String[] args) {
////		
////		Result result = new Result();
////		ClassTask2 classTask2 = new ClassTask2();
////		
////		int[] arNum = {1, 2, 3, 4, 5};
////		int[] arData = {70, 80, 90, 60, 70};
////		classTask2.getSumAndaAVR(arData, result, 0);
////		System.out.println(result.avr);
////		System.out.println(result.sum);
////	}
//////   �ִ밪, �ּҰ� ���ϱ�
////   void getMaxAndMin(int[] arData, Result result) {
////      result.max = arData[0];
////      result.min = arData[0];
////      
////      for (int i = 0; i < arData.length; i++) {
////         if(result.max < arData[i]) {result.max = arData[i];}
////         if(result.min > arData[i]) {result.min = arData[i];}
////      }
////   }
////   
//////   �л���ȣ, ��������, ��������, ���������� �Է¹��� �� �� �հ� ��� ���ϱ�
////   
////   public static void main(String[] args) {
////      Result result = new Result();
////      ClassTask2 classTask2 = new ClassTask2();
////      int[] arData = {1, 5, 3, 7, 8};
////      classTask2.getMaxAndMin(arData, result);
////      System.out.println(result.max);
////      System.out.println(result.min);
////   }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
