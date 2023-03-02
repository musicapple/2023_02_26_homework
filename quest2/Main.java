package quest2;

public class Main {

	public static void main(String[] args) {
		
		Person[] person = new Person[6];
		
		person[0] = new Student("안영서",24,"학생");
		person[1] = new Student("이창훈",30,"학생");
		
		person[2] = new Teacher("이민화",23,"선생님");
		person[3] = new Teacher("장성준",28,"선생님");
		
		person[4] = new SalaryMan("김민주",26,"직장인");
		person[5] = new SalaryMan("김용주",33,"직장인");
		
		for(int i=0; i<person.length; i++) {
			person[i].info();
		}
	}

}
