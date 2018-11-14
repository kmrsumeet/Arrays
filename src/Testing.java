
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "hdfs://production1/user/oozie/oozie_workflow_Retention/config/VerticaTableInfo.xml";
		String filename = file.substring(file.lastIndexOf('/') + 1,
	    	        file.length());
		System.out.println(filename);
	}

}
