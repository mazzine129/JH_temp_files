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
        label_array_kor.add("만화책");  // "Comics" 
        label_array_kor.add("장난감");  // "Toy" 
        label_array_kor.add("수염");  // "Beard" 
        label_array_kor.add("스타킹");  // "Tights" 
        label_array_kor.add("새");  // "Bird" 
        label_array_kor.add("도자기");  // "Porcelain" 
        label_array_kor.add("꽃잎");  // "Petal" 
        label_array_kor.add("쿠션");  // "Cushion" 
        label_array_kor.add("선글라스");  // "Sunglasses" 
        label_array_kor.add("배드민턴");  // "Badminton" 
        label_array_kor.add("자전거 ");  // "Bicycle" 
        label_array_kor.add("배");  // "Boat" 
        label_array_kor.add("미소");  // "Smile" 
        label_array_kor.add("발가락");  // "Toe" 
        label_array_kor.add("벽돌");  // "Brick" 
        label_array_kor.add("사람");  // "Person" 
        label_array_kor.add("화장실");  // "Bathroom" 
        label_array_kor.add("웃음");  // "Laugh" 
        label_array_kor.add("풍선");  // "Balloon" 
        label_array_kor.add("목걸이");  // "Necklace" 
        label_array_kor.add("컴퓨터");  // "Computer" 
        label_array_kor.add("의자");  // "Chair" 
        label_array_kor.add("시계");  // "Clock" 
        label_array_kor.add("남자");  // "Dude" 
        label_array_kor.add("책상");  // "Desk" 
        label_array_kor.add("고양이");  // "Cat" 
        label_array_kor.add("쥬스");  // "Juice" 
        label_array_kor.add("인형");  // "Stuffed toy" 
        label_array_kor.add("타일");  // "Tile" 
        label_array_kor.add("콜라");  // "Cola" 
        label_array_kor.add("모자");  // "Hat" 
        label_array_kor.add("커피");  // "Coffee" 
        label_array_kor.add("축구");  // "Soccer" 
        label_array_kor.add("음식");  // "Food" 
        label_array_kor.add("과일");  // "Fruit"
        
    System.out.println(label_array_dict.get(0));
	int label_num = r.nextInt(label_array_dict.size());
    System.out.println(label_array_dict.size());
    System.out.println(label_num);
    System.out.println(label_array_dict.get(label_num));
	} 
}
