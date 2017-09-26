package aopexam;

public class Dog implements Animal{
	public String eat() {
		System.out.println("치킨을 먹었습니다");
		return "강아지";
	}
	public void sleep(){
		System.out.println("잠자다");
	}
}
