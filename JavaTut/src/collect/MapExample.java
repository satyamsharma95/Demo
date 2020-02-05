package collect;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		HashMap<String,String> obj = new HashMap<String,String>();
		obj.put("1", "Satyam");
		obj.put("2", "Neha");
		obj.put("3", "Vaishali");
		obj.put("4", "Rahul");
		obj.put("5", "Kalpana");
		obj.put("6", "Himanshu");
		obj.put("7", "Saumik");
		for(Map.Entry<String, String> data:obj.entrySet())
		{
			System.out.println("Key value is "+ " "+data.getKey()+" data is  "+data.getValue());
		}

	}

}
