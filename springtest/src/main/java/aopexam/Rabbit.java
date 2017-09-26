package aopexam;

public class Rabbit implements Animal{
	public String eat() {
		System.out.println("풀떼기를 먹었습니다");
		return "토끼";
	}
}
