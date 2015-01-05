import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Set;
import java.util.Iterator;
import java.util.Collection;

public class Folder extends FolderGroups {
	
	Collection<FolderGroups> folderGroups = new ArrayList<>();
	
	String folderGroupsName;
	String folderGroupsDescription;
	
	public Folder(String newFolderGroupsName, String newFolderGroupsDescription){
		
		folderGroupsName = newFolderGroupsName;
		folderGroupsDescription = newFolderGroupsDescription;
		
	}
	
	public String getFolderGroupsName() { 
	return folderGroupsName; 
	}
	public String getFolderGroupsDescription() { 
	return folderGroupsDescription; 
	}
	
	public void add(FolderGroups newFolderGroups)  {		
		folderGroups.add(newFolderGroups);		
	}
	
	public void remove(FolderGroups newFolderGroups) {		
		folderGroups.remove(newFolderGroups);		
	}
	
	/*public Collection<FolderGroups> getFolderGroups(int folderGroupsIndex) {
				return (Collection<FolderGroups>)folderGroups.get(folderGroupsInde
				}"*/
	
	public void displayFileInfo(){
		System.out.println();		
		System.out.println("Folder: " + getFolderGroupsName()  +
				getFolderGroupsDescription() + "\n" + "\t");
		
		// prints any Files or Folders added to this Folder ArrayList folderGroups
		
		Iterator fileIterator = folderGroups.iterator();
		
		while(fileIterator.hasNext()) { 
			
			FolderGroups fileInfo = (FolderGroups) fileIterator.next();
			
			fileInfo.displayFileInfo();
			
		}		
	}	
}