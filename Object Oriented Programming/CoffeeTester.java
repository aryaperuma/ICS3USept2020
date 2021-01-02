package oop;

public class CoffeeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create an object of class type CofeeConstructor
CoffeeConstructor latte = new CoffeeConstructor(3, 3, "bitter", " light ", 26.5); // 5 parameters
System.out.println(latte.addSugar(2));
latte.stir();
System.out.println(latte.addSugar(2));
latte.stir();
System.out.print(" Making another coffee...... ");
CoffeeConstructor vanillaBean = new CoffeeConstructor(3, " sweet ", " light brown ", 28); // 4 parameters
System.out.println(vanillaBean.addSugar(3));
vanillaBean.stir();
System.out.println(vanillaBean.addSugar(3));
vanillaBean.stir();
System.out.println();
System.out.println(latte.toString());
System.out.println(vanillaBean.toString());

// name 
	}

}
