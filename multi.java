import java.util.*; //Ű���忡�� �Է� ���� ���� �������� ����� ����

public class multi {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);  //scanner ����
		
		System.out.print("���ڸ� �Է��ϼ��� : ");  
		int n = s.nextInt();                 //�Էµ� ���� ���� n�� ����
		
		for(int i=1; i<=9; i++) {            //�ݺ��� �̿�
			System.out.println(n + " X " + i + " = " + i * n);
			               //�Է¹�����              1~9         1~9 �Է¹�����
		}
	}
}
