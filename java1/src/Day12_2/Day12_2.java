package Day12_2;

import java.awt.desktop.UserSessionListener;
import java.util.ArrayList;
import java.util.Scanner;

public class Day12_2 {
	
	//����Ŭ���� ����
	//���� : ����Ʈ�� ������ ��� ���Ͽ� ���� / ������ �о�ͼ� ����Ʈ�� ����
	
	public static ArrayList<user> userlist = new ArrayList<>();
		//public : ����������[��� ���� ����]
			//static : �޷θ� �켱�Ҵ� [���α׷� ����� �ʱ�ȭ]
	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws Exception {
	
		//���� �ҷ�����
		userlist = FileUtil.readfile(new File("C:/java/","userlist.txt"));
		
		
		while(true) { 
			
				user temp = new user();
				temp.signup();
		
		
		
		
		}
		
	}

}
