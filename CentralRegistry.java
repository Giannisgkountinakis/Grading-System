import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JList;

public class CentralRegistry {


	private static ArrayList<String> studentsIds = new ArrayList<>();
	
	public static void showStudents(ArrayList<String> ids) 
	{
		 for (String id :ids) 
		 {	 
			 studentsIds.add(id); 
		 }
	}
	 
	public static ArrayList<String> getStudentsIds()
	{
		return studentsIds;
	}

}
