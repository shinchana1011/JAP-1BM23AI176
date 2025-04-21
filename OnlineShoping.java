package S1BM23AI176;

import java.util.Vector;
class product {
    String name;
    double price;
    String category;
    public product(String name,double price,String category){
        this.name=name;
        this.price=price;
        this.category=category;
    }
}
public class OnlineShopping{
    private final Vector<product> inventory;
    public OnlineShopping(){
        inventory=new Vector<>();
    }
    public void addProduct(String name,double price,String category){
        product product=new product(name,price,category);
        inventory.add(product);
    }
    public void removeProduct(String name){
        for(int i=0;i<inventory.size();i++){
            if(inventory.get(i).name.equalsIgnoreCase(name)){
                inventory.remove(i);
                break;
            }
        }
    }
    public void displayInventory(){
        System.out.println("Inventory:");
        for(product product:inventory){
            System.out.println("Name:"+product.name+",price:"+product.price+",Category:"+product.category);
        }
    }
    public static void main(String[] args){
        OnlineShopping manager=new OnlineShopping();
        manager.addProduct("laptop",4000,"Electronics");
        manager.addProduct("T-shirt",550,"clothing");
        manager.addProduct("book",920,"books");
        //display all items
        manager.displayInventory();
        //remove book item
        manager.removeProduct("book");
        //updated display
        manager.displayInventory();
        //remove laptop
        manager.removeProduct("laptop");
        //print updated
        manager.displayInventory();

    }


}

