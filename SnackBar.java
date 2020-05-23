import java.util.ArrayList;
import java.util.Iterator;
class SnackBar implements MenuList{
	ArrayList<Menu> menus = new ArrayList<>();
	SnackBar(){
		menus.add(new CasualMenu());
		menus.add(new MealMenu());
		menus.add(new FriedMenu());
		menus.add(new Beverage());
	}
	@Override
	public Iterator<MenuItem> getAllMenu() {
		ArrayList<MenuItem> allMenu = new ArrayList<>();
		
		for(Menu m : menus)
			allMenu.addAll(m.getMenu());
		
		return allMenu.iterator();
	}
	@Override
	public Iterator<MenuItem> getMenu(String type) {
		Iterator<MenuItem> iterator = null;
		
		for(Menu m : menus) {
			if(type == m.getType()) {
				iterator = m.getMenu().iterator();
				break;
			}
		}
		return iterator;
	}
}

interface MenuList{
	abstract Iterator<MenuItem> getMenu(String type);
	abstract Iterator<MenuItem> getAllMenu();
}
