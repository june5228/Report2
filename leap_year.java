import java.util.*; 

public class leap_year {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  
		System.out.print("������ �Է��ϼ��� : ");
		int y = s.nextInt();
		
		if((y%4 == 0 && y%100 != 0)|| y%400 == 0) {
	
			System.out.println(y + "���� �����Դϴ�.");
		}else
			System.out.println(y + "���� ����Դϴ�.");
	}
}
