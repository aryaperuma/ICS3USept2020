package finalProject;
import java.text.NumberFormat;
import java.util.*;
public class MoonTeaShopConstructor {
public double price;
public String name;
public String category;
public String size;

NumberFormat numForm = NumberFormat.getCurrencyInstance();

public MoonTeaShopConstructor(String name, String category, double price) {
	this.price = price;
	this.category = category;
	this.name = name;
}

public MoonTeaShopConstructor(String name, String category, double price, String size) {
	this.price = price;
	this.category = category;
	this.name = name;
	this.size = size;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCategory() {
	return category;
}

public void setCategory(String category) {
	this.category = category;
}

public String size() {
	return size;
}

public void setSize(String size) {
	this.size = size;
}

public String toString() {
	if(size != null) {
		return "("+ size +")" + name + "\t" + numForm1.format(price);
	}
		else {
			return name + "\t" + numForm1.format(price);
		}
	}

public ArrayList<MoonTeaShopConstructor> MilkTea = new ArrayList<MoonTeaShopConstructor>();
public ArrayList<MoonTeaShopConstructor> FruitIcedTea = new ArrayList<MoonTeaShopConstructor>();
public ArrayList<MoonTeaShopConstructor> FoamTea = new ArrayList<MoonTeaShopConstructor>();
public ArrayList<MoonTeaShopConstructor> OolongTea = new ArrayList<MoonTeaShopConstructor>();
public ArrayList<MoonTeaShopConstructor> Slushie = new ArrayList<MoonTeaShopConstructor>();
public ArrayList<MoonTeaShopConstructor> Milkshake = new ArrayList<MoonTeaShopConstructor>();
public MoonTeaShopConstructor getMilkTea(int index) {
	return MilkTea.get(index);
}

public int getMilkTeaSize() {
	return MilkTea.size();
}

public String getAllMilkTeas() {
	String theTeaShop = "";
	theTeaShop += "MILK TEAS:\n";
	for(int i = 0; i < MilkTea.size(); i++) {
		MoonTeaShopConstructor m = MilkTea.get(i);
		theTeaShop += "M" + (i+1) + " " + m.toString() + "\n";
	}
	return theTeaShop;
	
} 
	
public MoonTeaShopConstructor FruitIcedTea(int index) {
		return FruitIcedTea.get(index);
	}

public int getFruitIcedTeaSize() {
	return FruitIcedTea.size();
}

public String getAllFruitIcedTeas() {
	String theTeaShop = "";
	theTeaShop += "FRUIT ICED TEAS:\n";
	for(int i = 0; i < FruitIcedTea.size(); i++) {
		MoonTeaShopConstructor f = FruitIcedTea.get(i);
		theTeaShop += "F" + (i+1) + " " +f.toString() + "\n";
	}
	return theTeaShop;
	
}

public MoonTeaShopConstructor getFoamTea(int index) {
	return FoamTea.get(index);
}

public int getFoamTeaSize() {
	return FoamTea.size();
}

public String getAllFoamTeas() {
	String theTeaShop = "";
	theTeaShop += "FOAM TEAS:\n";
	for(int i = 0; i < FoamTea.size(); i++) {
		MoonTeaShopConstructor t = FoamTea.get(i);
		theTeaShop += "T" + (i+1) + " " + t.toString() + "\n";
	}
	return theTeaShop;
} 

public MoonTeaShopConstructor getOolongTea(int index) {
	return OolongTea.get(index);
}

public int getOolongTeaSize() {
	return OolongTea.size();
}

public String getAllOolongTeas() {
	String theTeaShop = "";
	theTeaShop += "OOLONG TEA:\n";
	for(int i = 0; i < OolongTea.size(); i++) {
		MoonTeaShopConstructor o = OolongTea.get(i);
		theTeaShop += "O" + (i+1) + " " + o.toString() + "\n";
	}
	return theTeaShop;
} 

public MoonTeaShopConstructor getSlushie(int index) {
	return Slushie.get(index);
}

public int getSlushieSize() {
	return Slushie.size();
}

public String getAllSlushies() {
	String theTeaShop = "";
	theTeaShop += "SLUSHIES:\n";
	for(int i = 0; i < Slushie.size(); i++) {
		MoonTeaShopConstructor s = Slushie.get(i);
		theTeaShop += "S" + (i+1) + " " + s.toString() + "\n";
	}
	return theTeaShop;
} 

public MoonTeaShopConstructor getMilkshake(int index) {
	return Milkshake.get(index);
}

public int getMilkshakeSize() {
	return Slushie.size();
}

public String getAllMilkshakes() {
	String theTeaShop = "";
	theTeaShop += "MILKSHAKES:\n";
	for(int i = 0; i < Milkshake.size(); i++) {
		MoonTeaShopConstructor l = Milkshake.get(i);
		theTeaShop += "I" + (i+1) + " " + l.toString() + "\n";
	}
	return theTeaShop;
} 

public MoonTeaShopConstructor() {
	populateMoonTeaShopConstructor();
}

public void populateMoonTeaShopConstructor() {
	MilkTea.add(new MoonTeaShopConstructor("Moon Original Milk Tea", "Milk Tea", 3.00));
	MilkTea.add(new MoonTeaShopConstructor("Mango", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Strawberry", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Honeydew ", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Passion fruit", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Vanilla", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Matcha", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Taro", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Coffee", "Milk Tea", 5.00));
	MilkTea.add(new MoonTeaShopConstructor("Lychee", "Milk Tea", 5.00));
	FruitIcedTea.add(new MoonTeaShopConstructor("Moon Original Fruit Iced Tea", "Fruit Iced Tea", 3.45));
	FruitIcedTea.add(new MoonTeaShopConstructor("Orange", "Fruit Iced Tea", 3.45));
	FruitIcedTea.add(new MoonTeaShopConstructor("Strawberry", "Fruit Iced Tea", 4.05));
	FruitIcedTea.add(new MoonTeaShopConstructor("Very Berry", "Fruit Iced Tea", 4.05));
	FoamTea.add(new MoonTeaShopConstructor("Moon Original Foam Tea", "Foam Tea", 4.00));
	FoamTea.add(new MoonTeaShopConstructor("Honeydew", "FoamTea", 4.45));
	FoamTea.add(new MoonTeaShopConstructor("Matcha", "FoamTea", 4.45));
	FoamTea.add(new MoonTeaShopConstructor("Lychee", "FoamTea", 4.45));
	FoamTea.add(new MoonTeaShopConstructor("Jasmine", "FoamTea", 4.45));
	OolongTea.add(new MoonTeaShopConstructor("Jasmine", "OolongTea", 3.25));
	Slushie.add(new MoonTeaShopConstructor("Moon Original Slushie", "Slushie", 4.65));
	Slushie.add(new MoonTeaShopConstructor("Tropical", "Slushie", 6.00));
	Slushie.add(new MoonTeaShopConstructor("Blueberry", "Slushie", 6.00));
	Slushie.add(new MoonTeaShopConstructor("Raspberry", "Slushie", 6.00));
	Slushie.add(new MoonTeaShopConstructor("Strawberry", "Slushie", 6.00));
	Slushie.add(new MoonTeaShopConstructor("Mango", "Slushie", 6.00));
	Slushie.add(new MoonTeaShopConstructor("Peach", "Slushie", 6.00));
	Milkshake.add(new MoonTeaShopConstructor("Moon Original Creamy Milkshake", "Slushie", 5.50));
	Milkshake.add(new MoonTeaShopConstructor("Chocolate Delight", "Slushie", 6.45));
	Milkshake.add(new MoonTeaShopConstructor("Key Lime Pie", "Slushie", 6.45));
	Milkshake.add(new MoonTeaShopConstructor("Vanilla Dream", "Slushie", 6.45));
}

public String toString1() {
	String menu = "";
	menu += "MOON TEA SHOP MENU\n" +
			"********************************************************\n";
	menu += getAllMilkTeas()+ "\n";
	menu += getAllFruitIcedTeas() + "\n";
	menu += getAllFoamTeas() + "\n";
	menu += getAllOolongTeas() + "\n";
	menu += getAllSlushies() + "\n";
	menu += getAllMilkshakes() + "\n";
	return menu;
}

public static int orderNo = 0;


public ArrayList<MoonTeaShopConstructor> order = new ArrayList<MoonTeaShopConstructor>();

public void Order() {
	
}

public MoonTeaShopConstructor getItem(int index) {
	return order.get(index);
}

public void addItem(MoonTeaShopConstructor item) {
	order.add(item);
}

public void removeItem(MoonTeaShopConstructor item) {
	order.remove(item);
}

public int getSize() {
	return order.size();
}

public void clearOrder() {
	order.clear();
}

public int getNumber() {
	return orderNo;
}

public void incrementNo() {
	orderNo ++;
}

public String getServer() {
	Random rand = new Random();
	int num = rand.nextInt(10) + 1;
	switch(num) {
	case 1:
		return "Arya";
	case 2:
		return "Sabrina";
	case 3:
		return "Amber";
	case 4:
		return "Adrien";
	case 5:
		return "Josh";
	case 6: 
		return "BillyBobJoe";
	default:
			return "Sorry! No server available!";
	}
}

public String toString2() {
	String str = "";
	for(int i = 0; i < order.size(); i++) {
		str += order.get(i).toString2() + "\n\n";
	}
	return str;
}

public static double tax = 0.13;

public double subtotal;

public double total;

private NumberFormat numForm1 = NumberFormat.getCurrencyInstance();

MoonTeaShopConstructor order11 = new MoonTeaShopConstructor();

public MoonTeaShopConstructor(ArrayList<MoonTeaShopConstructor> order) {
	this.order = order;
}

public double getSubtotal() {
	return subtotal;
}

public double getTax() {
	return tax;
}

public double getTotal() {
	return total;
}

public double calculateSubtotal(Object MoonTeaShopConstructor) {
	finalProject.MoonTeaShopConstructor order1 = null;
	for(int i = 0; i < order1.getSize(); i++) {
		MoonTeaShopConstructor = order1.getItem(i);
		MoonTeaShopConstructor item = null;
		subtotal += item.getPrice();
	}
	return subtotal;
}

public double calcTax() {
	return subtotal * tax;
}

public double calcTotal() {
	total = subtotal + calcTax();
	return total;
}

public void clearPayments() {
	subtotal = 0;
	total = 0;
}

public String checkPayment(double payment) {
	if(payment == total) {
		return "Enough money payed!";
	}
	else if(payment > total) {
		return "Here is your change:" + numForm.format(payment - total);
	}
	else{
		return "Please pay" + numForm.format(total - payment + " more");
	}
}
}



