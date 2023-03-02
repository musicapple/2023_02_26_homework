package quest2;

public interface Person {

	
	String getName();
	int getAge();
	String getJob();
	
	void info();
}

class Student implements Person{

	private String name;
	private int age;
	private String job;
	
	public Student(String name,int age,String job) {
		this.name=name;
		this.age=age;
		this.job=job;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getJob() {
		return job;
	}
	@Override
	public void info() {
		System.out.println("이름: "+name+", 나이: "+age+", 직업: "+job);
	}
	
}

class SalaryMan implements Person{

	private String name;
	private int age;
	private String job;
	
	public SalaryMan(String name,int age,String job) {
		this.name=name;
		this.age=age;
		this.job=job;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getJob() {
		return job;
	}
	@Override
	public void info() {
		System.out.println("이름: "+name+", 나이: "+age+", 직업: "+job);		
	}
	
}
class Teacher implements Person{

	private String name;
	private int age;
	private String job;
	
	public Teacher(String name,int age,String job) {
		this.name=name;
		this.age=age;
		this.job=job;
	}
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getJob() {
		return job;
	}
	@Override
	public void info() {
		System.out.println("이름: "+name+", 나이: "+age+", 직업: "+job);		
	}
	
}