package quest1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);

		User[] user = new User[3];
		 
		user[0] = new User("홍길동","hong","hong123");
		user[1] = new User("김철수","kim","kim248");
		user[2] = new User("이통키","tong","tong456");
		
		System.out.print("아이디를 입력하세요: ");
		String id=sc.next();
		System.out.print("비밀번호를 입력하세요: ");
		String pw=sc.next();
		
		
		for(int i =0; i<3; i++) {
			if(!id.equals(user[i].getId())) {
				if(i==2) {
				System.out.println("해당하는 id가 없습니다.");
				break;
				}
			}
			if(!pw.equals(user[i].getPw())) {
				if(i==2) {
				System.out.println("해당하는 pw가 없습니다.");
				}
			}
			if(id.equals(user[i].getId()) && pw.equals(user[i].getPw())) {
				System.out.println("로그인 성공");
				System.out.println(user[i].getUserName()+"님 환영합니다.");
				break;
			}
		}
		
		
		
		
		
		

		
	}

}
