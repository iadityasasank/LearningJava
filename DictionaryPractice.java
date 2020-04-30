import java.util.HashMap;
import java.util.Map;

public class DictionaryPractice {

	public static void main(String[] args) {
		// English to Telugu Dictionary
		Map<String,String>EtoTDic = new HashMap<String,String>();
		
		//Insering Things into Dictionary
		//put(Key,Values)
		EtoTDic.put("Monday", "Soma Varam");
		EtoTDic.put("Tuesday", "Magala Varam");
		EtoTDic.put("Wednesday", "Budavaram Varam");
		EtoTDic.put("Thursday", "Guru Varam");
		EtoTDic.put("Friday", "Sukru Varam");
		EtoTDic.put("Saturday", "Sheni Varam");
		EtoTDic.put("Sunday","Adhi Varam");

			//Getting Things from Dictionary
		System.out.println(EtoTDic.get("Saturday"));
		System.out.println(EtoTDic.get("Friday"));
		System.out.println(EtoTDic.get("Thursday"));
		System.out.println(EtoTDic.get("Wednesday"));
		System.out.println(EtoTDic.get("Tuesday"));
		System.out.println(EtoTDic.get("Monday"));
		System.out.println(EtoTDic.get("Sunday"));
		
		//Printing all Keys
		System.out.println(EtoTDic.keySet());
		
		//Printing all Values
		System.out.println(EtoTDic.values());
		
		//Size
		System.out.println("Size of Dictionary : "+EtoTDic.size());
		
		Map<String,Boolean> Mood = new HashMap<String,Boolean>();
		
		//Inserting few questions
		Mood.put("Sad", true);
		Mood.put("Happy", false);
		Mood.put("Excited", false);
		Mood.put("Frustated", true);
		
		System.out.println(Mood.get("Frustated"));
		
		//keys=Values pairs printing
		
		System.out.println(Mood.toString());
		
		//Removing values
		
				Mood.remove("Happy");
		
		//Replacing Values
				Mood.replace("Sad", false);
				System.out.println(Mood.toString());
		// Is Dictionary Empty?
		
		System.out.println(Mood.isEmpty());
		
		//Clearing Dictionary
		Mood.clear();
		System.out.println(Mood.toString());
		// Is Dictionary Empty?
		
				System.out.println(Mood.isEmpty());
	}

}
