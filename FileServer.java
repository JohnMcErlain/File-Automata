public class FileServer{
	
	FolderGroups fileServer;
		
	public FileServer(FolderGroups newFileSystem){		
		fileServer = newFileSystem;	
	}
	
	public void getFileList(){		
		fileServer.displayFileInfo();		
	}	
}