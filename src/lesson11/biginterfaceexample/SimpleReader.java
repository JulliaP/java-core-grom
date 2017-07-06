package lesson11.biginterfaceexample;

public class SimpleReader implements Readable {
//NullPointerException is thrown when an application attempts 
	//to use an object reference that has the null value.
	
	//Object obj = null;
	 	//obj.toString();  // This statement will throw a NullPointerException
	
	@Override
	public void readFilesFromStorage(Storage storage) {
		for (File file : storage.getFiles()) {
			if (file !=null)// Statement if was added to prevent NullPointerException in case one element of array = null
			System.out.println(file.getName());
			else
				System.out.println(file);
		}
	}

}
