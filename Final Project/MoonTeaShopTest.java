package finalProject;

import java.util.List;
import java.util.Scanner;

import finalProject.MoonTeaShop.Product;
import finalProject.Products.Cart;

public class MoonTeaShopTest {
	public static class UI { 
	    public static void main (String [] args) {
	    	
	        new UI();
	    }
	}

         private int ch = 0;
         
         public void UI () {
             menu();
         }
         
         public void startScreen () {
             System.out.println("1. Display Store Products");
             System.out.println("2. Display Cart");
             System.out.println("0. Exit");
         }
         
         public void storeProductsMenu() {
             System.out.println("1. Add to Cart");
             System.out.println("2. Remove From Cart");
             System.out.println("0. Exit");
         }
         
         public void menu () {
             do {
                 startScreen();
                 getUserInput();
                 
                 switch (ch) {
                     case 1: 
                         displayStoreProducts();
                         storeProductsMenu();
                         getUserInput();
                         innerChoice1();
                         break;
                     case 2:
                         showCart();
                         break;
                     case 0:
                         System.exit(0);
                         break;
                     default:
                         
                         break;
                 }
             } while (ch != 0);
         }

         private void innerChoice1() {
             switch (ch) {
                 case 1:
                     addProductToCart();
                     showCart();
                     break;
                 case 2:
                     removeProductFromCart();
                     break;
                 default:
                     
                     break;
             }
         }

         private int getUserInput() throws NumberFormatException {
             Scanner in = new Scanner (System.in);
             ch = Integer.parseInt(in.nextLine());
             return ch;
         }

         private void displayStoreProducts() {
             List<Product> products = new Products().getProducts();
             for (Product prod: products) {
                 System.out.println(
                         prod.getPid() + "- " +
                                 prod.getName() + " " +
                                 prod.getPrice() + " " +
                                 prod.getStock()
                 );
             }
         }

         private void addProductToCart() {
             int pid = getUserInput();
             Cart cart = null;
			cart.addProductToCartByPID(pid);      
         }

         private void showCart() {
             Cart cart = null;
			cart.printCartItems();
         }

         private void removeProductFromCart() {
             int pid = getUserInput();
             Cart cart = null;
			cart.removeProductByPID(pid);
         }
     }
     





