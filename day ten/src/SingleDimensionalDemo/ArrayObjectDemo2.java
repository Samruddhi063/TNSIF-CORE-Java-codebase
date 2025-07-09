package SingleDimensionalDemo;

public class ArrayObjectDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student_1 [] arr;
		
		arr=new Student_1[5];
		
		arr[0]=new Student_1(101,"heti");
		arr[1]=new Student_1(102,"niki");
		arr[2]=new Student_1(103,"sammy");
		arr[3]=new Student_1(104,"madhu");
		arr[4]=new Student_1(105,"sakshi");
		//arr[5]=new Student(106,"suraj");
		
		for(int i=0; i<=arr.length; i++)
		{
			
			System.out.println("element at"+i +":"+ arr[i].getRollNo()+"\t"+ arr[i].getName());
		}
		

	}

}
