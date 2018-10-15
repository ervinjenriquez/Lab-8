import java.util.ArrayList;
import java.util.Collections;
public class ClientClass {

	public static void main(String[] args) {
		
		ArrayList<Rectangle> list = new ArrayList<Rectangle>();
		
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		list.add(new Rectangle(randN(), randN(), randN(), randN()));
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);

	}
	
	public static int randN() {
		//Random Number Generator
		int randN = (int)(Math.random() * 50 + 1);
		return randN;
	}

}
