package aopanimal;

class Dog implements Animal{
	public String eat() {
		System.out.println("치킨을 먹었습니다");
		return "강아지";
	}
}

class Cat implements Animal{
	public String eat() {
		System.out.println("생선을 먹었습니다");
		return "고양이";
	}	
}

class Rabbit implements Animal{
	public String eat() {
		System.out.println("풀떼기를 먹었습니다");
		return "토끼";
	}	
}