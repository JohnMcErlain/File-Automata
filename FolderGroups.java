// This acts as an interface for all files and folders

public abstract class FolderGroups  {
	
	public void add(FolderGroups newFolderGroups) {		
		throw new UnsupportedOperationException();		
	}
		
	public void remove(FolderGroups newFolderGroups) {			
		throw new UnsupportedOperationException();
	}
		
	public FolderGroups getFolderGroups(int FolderGroupsIndex) {
		throw new UnsupportedOperationException();			
	}
	
	public String getFileName() {			
		throw new UnsupportedOperationException();			
	}
		
	public String getFileContents() {				
		throw new UnsupportedOperationException();				
	}
		
	/* When called by a class object that extends FolderGroups next method will print specific information regarding file or folder */
	
	public void displayFileInfo() {				
		throw new UnsupportedOperationException();				
	}
	
}