import java.io.File;
import java.util.Scanner;

public class FileSystem {
    public static final Scanner INPUT = new Scanner(System.in);
	private static FolderGroups fileSystem; 
    private static FileServer fileServer;	
	
	public static void main(String[] args){
	System.out.println("Please type path of a directory to explore: ");
    String userFile = INPUT.nextLine();
    File[] files = new File(userFile).listFiles();
	// Top level component that holds everything	
	fileSystem = new Folder("Top level folder: ", userFile +"\n"); 			

	System.out.println();	
	createVirtualFileSystem(files);					
	fileServer.getFileList();			
	}

	public static FileServer createVirtualFileSystem(File[] files) {
    for (File file : files) {
        if (file.isDirectory()) {
            createVirtualFileSystem(file.listFiles()); // recursive			
		    fileSystem.add(new Folder(file.getName() + " ", "  "));
        } else { 
			fileSystem.add(new VirtualFile(file.getName()));		
        }
}
        fileServer = new FileServer(fileSystem);		
		return fileServer;
}
}