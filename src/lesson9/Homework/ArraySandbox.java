package lesson9.Homework;

public class ArraySandbox {
	
	public static void main(String[] args) {
		//Heap (куча) - коммунальная кухня. Стек -отдельная комнатa, краткосрочная память, сушествует пока исполняется метод
		//локальные переменные создаются в стек
		//Когда создаётся объект с использованием new - память выделяется на heap
		
		User[] users = new User[10];
		
		for (User u: users){
			//System.out.println(u);
		}
		
		//System.out.println();
		
	/*	for(int i = 0; i < users.length; i++){
			User user = new User(i,"", "");
			users[i] = user;
		}
		
		System.out.println();
		
		for (User u: users) {
			System.out.println(u);
		}
		
		System.out.println();
		
		for (User u: users) {
			System.out.println(u.getId());
		}
		*/
	}
	
	
	
	static void intArrayExample() {
		// index     0     1     2     .     .    .
		//        |__0__|__0__|__0__|__0__|____|____|____|____|____|____|
		int[] ints = new int[10];
		
		for (int i:ints) {
		   // System.out.println(i);
		}
		
		for (int i=0; i < ints.length; i++) {
			int currentValue = ints[i]; // currentValue = |__0__| 
			currentValue = i;           // currentValue = |__i__| 0, 1, 2, 3 ...
			//ints[i] = i;
			System.out.println(currentValue);
			//System.out.println(ints[i]); // i == 1
		}
		
		System.out.println();
		
		for (int i:ints) {
		    //System.out.println(i);
		}		
	}

}
