import java.util.*; 

public class leap_year_while {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		
		while(true) { 
		System.out.print("������ �Է��ϼ���(��,0���� ���� ���� �Է��ϸ� ����) : ");
		
		int y = s.nextInt();
		
		if(y <=0){ 
			System.out.println("���α׷��� �����մϴ�.");
			break; }
		
		if((y%4 == 0 && y%100 != 0)|| y%400 == 0) {
			
			System.out.println(y + "���� �����Դϴ�.");
			
		}else
			System.out.println(y + "���� ����Դϴ�.");
		    
	}
}
}
