public class VirtualFile extends FolderGroups {
	
	String virtualFileName;
	
	public VirtualFile(String newVirtualFileName){		
		virtualFileName = newVirtualFileName;		
	}
	
	public String getVirtualFileName() { 
	    return virtualFileName; 
	}
	
	public void displayFileInfo(){		
		System.out.println("File: " + getVirtualFileName());		
	}	
}