import java.util.Iterator;
class MenuAdapter{
	int i;
	MenuList menuList;
	
	MenuAdapter(){
		menuList = new SnackBar();
	}
	
	Object[][] getAllMenu(){
		i = 0;
		Object[][] result = new Object[getIteratorLength(menuList.getAllMenu())][];
		Iterator<MenuItem> iterator = menuList.getAllMenu();
		while(iterator.hasNext()) {
			MenuItem menu = (MenuItem)iterator.next();
			String name = menu.getName();
			String description = menu.getDescription();
			String price = Integer.toString(menu.getPrice());
			result[i] = new Object[]{name, description, price};
			i++;
		}
		return result;
	}
	
	Object[][] getMenu(String type){
		i = 0;
		Object[][] result = new Object[getIteratorLength(menuList.getMenu(type))][];
		Iterator<MenuItem> iterator = menuList.getMenu(type);
		while(iterator.hasNext()) {
			MenuItem menu = (MenuItem)iterator.next();
			String name = menu.getName();
			String description = menu.getDescription();
			String price = Integer.toString(menu.getPrice());
			result[i] = new Object[]{name, description, price};
			i++;
		}
		
		return result;
	}
	
	Object[][] getAllMenuByPrice(){
		Object[][] result = new Object[getIteratorLength(menuList.getAllMenu())][];
		Iterator<MenuItem> iterator;
		String name, description, price;
		int p = 500;
		
		for(int i = 0; i < result.length; p += 500) {
			iterator = menuList.getAllMenu();
			while(iterator.hasNext()){
				MenuItem menu = (MenuItem)iterator.next();
				if(menu.getPrice() == p) {
					name = menu.getName();
					description = menu.getDescription();
					price = Integer.toString(menu.getPrice());
					result[i] = new Object[]{name, description, price};
					i++;
				}
			}
		}
		
		return result;
	}
	int getIteratorLength(Iterator iterator) {
		int length = 0;
		
		while(iterator.hasNext()) {
			iterator.next();
			length++;
		}
		
		return length;
	}
}
