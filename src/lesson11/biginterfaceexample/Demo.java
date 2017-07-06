package lesson11.biginterfaceexample;

public class Demo {
	
	public static void main(String[] args) {
		File file1 = new File("test", "C:/user/home", "txt", 11);
		File file2 = new File("test", "C:/user/home", "txt", 3);
		File file3 = new File("video", "C:/user/home", "txt", 0);
		//File file4 = new File("test", "C:/user/home", "txt", 11);
		File file5 = new File("myhome", "C:/user/home", "jpg", 120);
		
		File[] files = new File[] {file1,file2, file3, null, file5};
		Storage storage = new Storage(files);
		
		FileReader fileReader = new FileReader();
		SimpleReader simpleReader = new SimpleReader();
		
		read(storage, fileReader);
		read(storage, simpleReader);
	}

	private static void read (Storage storage, Readable readable){
		readable.readFilesFromStorage(storage);
	}
}
//polimorfizm eto kogda odin i tot zhe metod rabotaet dlja raznyxi typov dannyx
// zdes' polimorfizm realizovan s pomoshju interfejca
//v kachestve parametra zdes' my peredaem interface Readable ili tochnee implementacii nashego interfejsa
//my prerdaem ljubuju implementaciju