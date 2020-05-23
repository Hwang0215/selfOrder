
import java.util.ArrayList;

class MenuItem {
	String name, description;
	int price;
	
	MenuItem(String name, String description, int price){
		this.name = name;
		this.description = description;
		this.price = price;
	}
	String getName() {
		return name;
	}
	String getDescription() {
		return description;
	}
	int getPrice() {
		return price;
	}
}

class Menu{
	private String type;
	ArrayList<MenuItem> menuItems = new ArrayList<>();
	
	void addItem(String name, String description, int price) {
		MenuItem menuItem = new MenuItem(name, description, price);
		menuItems.add(menuItem);
	}
	Menu(String type){
		this.type = type;
	}
	
	public ArrayList<MenuItem> getMenu(){
		return menuItems;
	}
	
	public String getType() {
		return type;
	}
}

class CasualMenu extends Menu{
	CasualMenu(){
		super("분식류");
		addItem("김밥", "돌돌돌 김밥", 2500);
		addItem("밀떡볶이", "특제소스 + 밀떡", 3000);
		addItem("쌀떡볶이", "특제소스 + 쌀떡", 3000);
		addItem("순대", "쫄깃한 순대 한 팩", 4000);
	}
	
}

class MealMenu extends Menu{
	MealMenu(){
		super("식사류");
		addItem("참치마요컵밥", "참치+마요네즈 컵밥", 3000);
		addItem("잔치국수", "호로록 잔치국수", 5000);
		addItem("오므라이스", "평범한 오므라이스", 6000);
		addItem("왕돈까스", "옛날식 왕돈까스", 6000);
	}
}

class FriedMenu extends Menu{
	FriedMenu(){
		super("튀김류");
		addItem("김말이튀김", "김말이튀김 4개", 2000);
		addItem("오징어튀김", "오징어튀김 6개", 2000);
		addItem("고구마튀김", "고구마튀김 6개", 2000);
		addItem("새우튀김", "새우튀김 4개", 2000);
		addItem("모듬튀김", "바삭한 4종류 튀김 종합", 7000);
	}
}

class Beverage extends Menu{
	Beverage(){
		super("음료");
		addItem("콜라", "코카콜라 500ml", 1000);
		addItem("사이다", "칠성사이다 500ml", 1000);
		addItem("쿨피스", "복숭아쿨피스 1000ml", 1500);
	}
}