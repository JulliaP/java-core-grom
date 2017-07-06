package lesson11.biginterfaceexample;

public class FileReader implements Readable {

	@Override
	public void readFilesFromStorage(Storage storage) {
		// najti file maximalnogo razmera
		//vyvesti vsju info o nem 
		printFile(findMaxSize(storage.getFiles()));
	}
		private File findMaxSize(File[] files) {
			File maxSizeFile = files[0];
			
			for(File file:files){
				if (file !=null && file.getSize() > maxSizeFile.getSize()){   // file != null was inserted to prevent NullPointerException
					maxSizeFile = file;
				}
			}
			
			return maxSizeFile;
		}
	private void printFile(File file){
		System.out.println("max file will be printed now...");
		System.out.println(file.getName());
		System.out.println(file.getExtension());
		System.out.println(file.getPath());
		System.out.println(file.getSize());
		System.out.println();
	}
	}
	
	

