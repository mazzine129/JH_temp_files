import java.util.ArrayList;
import java.util.Random;

public class Main { 
  public static void main(String[] args) { 
    
    Random r = new Random();
    
	ArrayList<String> label_array = new ArrayList<String>();
        label_array.add("Comics");
        label_array.add("Toy");
        label_array.add("Beard");
        label_array.add("Tights");
        label_array.add("Bird");
        label_array.add("Porcelain");
        label_array.add("Petal");
        label_array.add("Cushion");
        label_array.add("Sunglasses");
        label_array.add("Badminton");
        label_array.add("Bicycle");
        label_array.add("Boat");
        label_array.add("Smile");
        label_array.add("Toe");
        label_array.add("Brick");
        label_array.add("Person");
        label_array.add("Bathroom");
        label_array.add("Laugh");
        label_array.add("Balloon");
        label_array.add("Necklace");
        label_array.add("Computer");
        label_array.add("Chair");
        label_array.add("Clock");
        label_array.add("Dude");
        label_array.add("Desk");
        label_array.add("Cat");
        label_array.add("Juice");
        label_array.add("Stuffed toy");
        label_array.add("Tile");
        label_array.add("Cola");
        label_array.add("Hat");
        label_array.add("Coffee");
        label_array.add("Soccer");
        label_array.add("Food");
        label_array.add("Fruit");
        
    
    System.out.println(label_array.get(0));
	int label_num = r.nextInt(label_array.size());
    System.out.println(label_array.size());
    System.out.println(label_num);
    System.out.println(label_array.get(label_num));
	
    
	ArrayList<String> label_array_kor = new ArrayList<String>( 
        label_array_kor.add(" ")  // "Comics" 
        label_array_kor.add(" ")  // "Toy" 
        label_array_kor.add(" ")  // "Beard" 
        label_array_kor.add(" ")  // "Tights" 
        label_array_kor.add(" ")  // "Bird" 
        label_array_kor.add(" ")  // "Porcelain" 
        label_array_kor.add(" ")  // "Petal" 
        label_array_kor.add(" ")  // "Cushion" 
        label_array_kor.add(" ")  // "Sunglasses" 
        label_array_kor.add(" ")  // "Badminton" 
        label_array_kor.add(" ")  // "Bicycle" 
        label_array_kor.add(" ")  // "Boat" 
        label_array_kor.add(" ")  // "Smile" 
        label_array_kor.add(" ")  // "Toe" 
        label_array_kor.add(" ")  // "Brick" 
        label_array_kor.add(" ")  // "Person" 
        label_array_kor.add(" ")  // "Bathroom" 
        label_array_kor.add(" ")  // "Laugh" 
        label_array_kor.add(" ")  // "Balloon" 
        label_array_kor.add(" ")  // "Necklace" 
        label_array_kor.add(" ")  // "Computer" 
        label_array_kor.add(" ")  // "Chair" 
        label_array_kor.add(" ")  // "Clock" 
        label_array_kor.add(" ")  // "Dude" 
        label_array_kor.add(" ")  // "Desk" 
        label_array_kor.add(" ")  // "Cat" 
        label_array_kor.add(" ")  // "Juice" 
        label_array_kor.add(" ")  // "Stuffed toy" 
        label_array_kor.add(" ")  // "Tile" 
        label_array_kor.add(" ")  // "Cola" 
        label_array_kor.add(" ")  // "Hat" 
        label_array_kor.add(" ")  // "Coffee" 
        label_array_kor.add(" ")  // "Soccer" 
        label_array_kor.add(" ")  // "Food" 
        label_array_kor.add(" ")  // "Fruit"
        
    System.out.println(label_array_dict.get(0));
	int label_num = r.nextInt(label_array_dict.size());
    System.out.println(label_array_dict.size());
    System.out.println(label_num);
    System.out.println(label_array_dict.get(label_num));
	} 
}
